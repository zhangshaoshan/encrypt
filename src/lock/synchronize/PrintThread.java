package lock.synchronize;

public class PrintThread implements Runnable {

    private final String lock = new String();
    private static Integer a = 100;
    @Override
    public void run() {
//        while (true) {
//            synchronized (this){
//                if (a > 0) {//有票 可以卖 //出票操作
//                    try {
//                        Thread.sleep(50);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    //获取当前线程对象的名字
//                    String name = Thread.currentThread().getName(); System.out.println(name + "正在卖:" + a--);
//                }
//            }
//        }
        print();

    }


//    public synchronized void print(){//
//        while (true) {
//            if (a > 0) {//有票 可以卖 //出票操作
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //获取当前线程对象的名字
//                String name = Thread.currentThread().getName(); System.out.println(name + "正在卖:" + a--);
//            }
//        }
//    }


    public synchronized static void print(){
        while (true){
            if (a>0){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName(); System.out.println(name + "正在卖:" + a--);
            }
        }
    }

}
