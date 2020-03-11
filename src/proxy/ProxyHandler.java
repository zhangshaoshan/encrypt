package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object object;
    public ProxyHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("类名：    "+proxy.getClass());
        System.out.println("方法名：  "+method.getName());
        //System.out.println("参数：    "+args.toString());
        System.out.println("before  method");
        method.invoke(object,args);
        System.out.println("after  method");
        return null;
    }
}
