package java8.defaultMethod;

public class MyClass implements DefaultInterface {
    @Override
    public void method1() {
        System.out.println("普通方法，必须实现");
    }

    @Override
    public String defaultMethod(String string) {
        System.out.println("default方法   可以不实现,,不实现的话，这个子类的对象去调用没反应");
        return string;
    }
}
