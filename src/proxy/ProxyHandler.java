package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object realSubject;

    public ProxyHandler(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        System.out.println(name+"invoke before");
        //调用目标对象的方法
        Object result = method.invoke(realSubject, args);
        System.out.println(name+"invoke after");
        return result;
    }
}
