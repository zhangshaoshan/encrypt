package proxy;

public class HelloProxy {
    private Hello hello = new Hello();
    public void sayHello(){
        System.out.println("HelloProxy----->say hello");
        hello.sayHello();
    }
}
