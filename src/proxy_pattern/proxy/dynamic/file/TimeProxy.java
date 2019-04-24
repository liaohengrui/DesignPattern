package proxy_pattern.proxy.dynamic.file;

import java.lang.Override;
import java.lang.reflect.Method;
import proxy_pattern.proxy.dynamic.Flyable;
import proxy_pattern.proxy.dynamic.InvocationHandler;

public class TimeProxy implements Flyable {
  private InvocationHandler handler;

  public TimeProxy(InvocationHandler handler) {
    this.handler = handler;
  }

  @Override
  public void fly() {
    try {
    	Method method = proxy_pattern.proxy.dynamic.Flyable.class.getMethod("fly");
    	this.handler.invoke(this, method, new Object[]{});
    } catch(Exception e) {
    	e.printStackTrace();
    }
  }
}
