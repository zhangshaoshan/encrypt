package thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("myRunable"+Thread.currentThread());
    }

}
