package caesar;

public class CaesarDemo {

    private static String clearText = "zhangshaoshan";
    private final static Integer key = 3;

    public static void main(String[] args) {
        String cipher = caesarEncrypt(clearText, key);
        System.out.println(cipher);
        String decrypt = decrypt(cipher,key);
        System.out.println(decrypt);
    }

    private static String caesarEncrypt(String clearText,Integer key){
        char[] charArray = clearText.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += key;
        }
        return new String(charArray);
    }

    private static String decrypt(String cipher,Integer key){
        char[] charArray = cipher.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] -= key;
        }
        return new String(charArray);
    }

}
