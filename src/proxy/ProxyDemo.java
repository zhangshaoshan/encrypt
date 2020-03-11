package proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        //testStaticProxy();
        testProxy();
    }

    /**
     * 静态代理，一个被代理需要一个代理类
     * */
    private static void testStaticProxy(){
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.sayHello();
    }

    /**
     * 动态代理
     * */
    private static void testProxy(){
        HelloInterface hello = new Hello();
        ProxyHandler proxyHandler = new ProxyHandler(hello);
        HelloInterface helloProxy = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), proxyHandler);
        helloProxy.sayHello();

        HelloInterface bye = new Bye();
        ProxyHandler proxyHandler1 = new ProxyHandler(bye);
        HelloInterface byeProxy = (HelloInterface) Proxy.newProxyInstance(bye.getClass().getClassLoader(), bye.getClass().getInterfaces(), proxyHandler1);
        byeProxy.sayHello();

    }

}
