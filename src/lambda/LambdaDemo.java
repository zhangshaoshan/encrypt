package lambda;

public class LambdaDemo {

    public static void main(String[] args) {
//        new Thread(()-> {
//            System.out.println("当前线程"+Thread.currentThread().getName());
//        }).start();
//
//
//        new Thread(()->{
//            System.out.println("当前线程2"+Thread.currentThread().getName());
//        }).start();

        String re = send("aaa",23,(String s,Integer i)->{
            for (int b = 0;b>100000;b++){
                if (b == 99999){
                    System.out.println("bbbbbbbbbbbbbbbb");
                }
            }
            return null;
        });

        String result = send("bbb",23333,(String s,Integer i)->{
            System.out.println(s+i+Thread.currentThread().getName());
            return s+i;
        });
        System.out.println(result);

    }


    private static String send(String string,Integer integer,LambdaThread lambdaThread){
       return lambdaThread.sendRequest(string,integer);
    }


}
