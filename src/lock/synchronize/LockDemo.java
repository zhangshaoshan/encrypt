package lock.synchronize;

public class LockDemo {
    public static void main(String[] args) {
        LockPrint printThread1 = new LockPrint();
        Thread thread1 = new Thread(printThread1,"线程1");
        //PrintThread printThread2 = new PrintThread();
        Thread thread2 = new Thread(printThread1,"线程2");
        Thread thread3 = new Thread(printThread1,"线程3");
        thread3.start();
        thread1.start();
        thread2.start();

    }
}
