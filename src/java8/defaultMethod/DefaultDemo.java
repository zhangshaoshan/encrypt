package java8.defaultMethod;

public class DefaultDemo {
    public static void main(String[] args) {
        DefaultInterface cl = new MyClass();
        cl.defaultMethod("bbb");
        cl.method1();
    }
}
