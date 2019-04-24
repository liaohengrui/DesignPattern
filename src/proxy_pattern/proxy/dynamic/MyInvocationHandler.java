package proxy_pattern.proxy.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/24
 */
public class MyInvocationHandler implements InvocationHandler {
    private Bird bird;

    public MyInvocationHandler(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void invoke(Object proxy, Method method, Object[] args) {
        long start = System.currentTimeMillis();
        try {
            method.invoke(bird, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(method.getName() + "running time is" + (end - start));
    }
}
