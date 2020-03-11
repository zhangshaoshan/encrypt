package Exception;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println(returnTest());
    }

    public static int returnTest(){
        int a = 0;
        try{
            int i = 1/0;
        }catch (Exception e){
            a = 30;
            return a;
        }finally {
            a = 40;
        }
        return a;
    }
}
