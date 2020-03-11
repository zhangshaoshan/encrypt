package thread;

import thread.MyCallable;
import thread.MyRunnable;
import thread.MyThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FaceTest {
    public static void main(String[] args) {
        //equalHashCode();
        //math();
        //string();
        thread();
    }

    private static void equalHashCode() {
        String a = "Aa";
        String b = "BB";
        if (a.equals(b)) {
            System.out.println("-----------equal");
        }
        System.out.println("a hashCode"+a.hashCode());
        System.out.println("b hashCode"+b.hashCode());
        if (a.hashCode() == b.hashCode()){
            System.out.println("-----------hashCode");
        }
    }

    private static void math(){
        System.out.println(Math.round(-1.5)); //round 最近取整 -1
        System.out.println(Math.round(1.2)); // 1
    }

    private static void string(){
        String a = "a";//不会分配地址空间，只是a单纯的指向"a"
        String b = new String("b");//会给b分配内存空间，并且指向"b"


        String aa = "abcde";
        StringBuffer aaBuffer = new StringBuffer(aa);
        aaBuffer.reverse();
        System.out.println(aaBuffer);
    }

    private static void thread(){
        MyThread myThread1 = new MyThread();
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable"+Thread.currentThread());
            }
        });
        thread3.start();

        Thread thread4 = new Thread(new MyRunnable());
        thread4.start();

        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread thread5 = new Thread(futureTask);
        thread5.start();
        try {
            String string = futureTask.get();
            System.out.println(string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        FutureTask<String> futureTask1 = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "mycallable  22222"+Thread.currentThread();
            }
        });
        Thread thread6 = new Thread(futureTask1);
        thread6.start();
        try {
            System.out.println(futureTask1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
