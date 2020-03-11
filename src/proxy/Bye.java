package proxy;

public class Bye implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("Bye------>say  bye");
    }
}
