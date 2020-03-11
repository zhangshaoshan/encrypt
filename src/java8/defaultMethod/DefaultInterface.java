package java8.defaultMethod;

public interface DefaultInterface {

    public void method1();

    default String defaultMethod(String string){
        return "默认的返回值";
    }
}
