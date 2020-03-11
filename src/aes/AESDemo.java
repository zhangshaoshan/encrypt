package aes;


public class AESDemo {

    public static void main(String[] args) {
        String encrypt = AESUtil.encrypt("abcFGHEL啊啊啊");
        System.out.println("机密后数据：  "+encrypt);
        String decrypt = AESUtil.decrypt(encrypt);
        System.out.println("解密后数据：  "+decrypt);

    }
}
