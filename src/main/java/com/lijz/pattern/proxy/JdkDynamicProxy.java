package com.lijz.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class JdkDynamicProxy implements InvocationHandler {

    private Object object;

    public static Object newInstance(Object obj){
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new JdkDynamicProxy(obj));
    }

    private JdkDynamicProxy(Object obj){
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method " + method.getName());
        long start = System.nanoTime();
        Object result = method.invoke(object, args);
        System.out.println(String.format("%s took %d ns", method.getName(), (System.currentTimeMillis()-start)));
        return result;
    }

    public static void main(String[] args){

        TestService testService = (TestService)JdkDynamicProxy.newInstance(new TestServiceImpl());
        testService.doSomething();

    }
}
