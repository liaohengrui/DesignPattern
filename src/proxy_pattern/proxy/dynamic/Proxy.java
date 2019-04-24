package proxy_pattern.proxy.dynamic;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import proxy_pattern.proxy.dynamic.Bird;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/24
 */
public class Proxy {
    public static Object newProxyInstance(Class inf, InvocationHandler handler) throws IOException {
        TypeSpec.Builder typeSpecBuilder = TypeSpec.classBuilder("TimeProxy")
                .addSuperinterface(inf)
                .addModifiers(Modifier.PUBLIC);

        FieldSpec fieldSpec = FieldSpec.builder(InvocationHandler.class, "handler", Modifier.PRIVATE).build();
        typeSpecBuilder.addField(fieldSpec);

        MethodSpec constructMethodSpec = MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .addParameter(InvocationHandler.class, "handler")
                .addStatement("this.handler = handler")
                .build();
        typeSpecBuilder.addMethod(constructMethodSpec);

        Method[] methods = inf.getDeclaredMethods();
        for (Method method : methods) {
            MethodSpec methodSpec = MethodSpec.methodBuilder(method.getName())
                    .addModifiers(Modifier.PUBLIC)
                    .addAnnotation(Override.class)
                    .returns(method.getReturnType())
                    .addCode("try {\n")
                    .addStatement("\t$T method = " + inf.getName() + ".class.getMethod(\"" + method.getName() + "\")", Method.class)
                    // 为了简单起见，这里参数直接写死为空
                    .addStatement("\tthis.handler.invoke(this, method, new Object[]{})")
                    .addCode("} catch(Exception e) {\n")
                    .addCode("\te.printStackTrace();\n")
                    .addCode("}\n")
                    .build();
            typeSpecBuilder.addMethod(methodSpec);
        }
        JavaFile javaFile = JavaFile.builder("proxy_pattern.proxy.dynamic.file", typeSpecBuilder.build()).build();
        // 为了看的更清楚，我将源码文件生成到桌面
        javaFile.writeTo(new File("D:\\IdeaProjects\\DesignPatterns\\src"));
        JavaCompiler.compile(new File("D:\\IdeaProjects\\DesignPatterns\\src\\proxy_pattern\\proxy\\dynamic\\file\\TimeProxy.java"));
        try {
            URL[] urls = new URL[]{new URL("file:/D:\\IdeaProjects\\DesignPatterns\\src")};
            URLClassLoader classLoader = new URLClassLoader(urls);
            Class clazz = classLoader.loadClass("proxy_pattern.proxy.dynamic.file.TimeProxy");
            Constructor constructor = clazz.getConstructor(InvocationHandler.class);
            Object obj = constructor.newInstance(handler);
            return obj;
        } catch (IOException | InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        try {
            Object o = newProxyInstance(Flyable.class, new MyInvocationHandler(new Bird()));
            ((Flyable) o).fly();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
