package lock.synchronize;

public class SynchronizeDemo {
    public static void main(String[] args) {
        PrintThread printThread1 = new PrintThread();
        PrintThread printThread2 = new PrintThread();
        Thread thread1 = new Thread(printThread1,"线程1");
        Thread thread2 = new Thread(printThread1,"线程2");
        Thread thread3 = new Thread(printThread2,"线程3");
        thread3.start();
        thread1.start();
        thread2.start();

    }
}
