package proxy_pattern.proxy.dynamic;

import java.lang.reflect.Method;

/**
 * Demo class
 *
 * @author HengruiLiao
 * @date 2019/4/24
 */
public interface InvocationHandler {
    void invoke(Object proxy, Method method, Object[] args);
}
