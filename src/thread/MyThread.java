package thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Thread"+Thread.currentThread());
    }
}
