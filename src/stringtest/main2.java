package stringtest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class main2 {
    public static void main(String[] args) {
        // int a=160;
        byte b = -96;
        int a = b & 0xff;
        // System.out.println("result:"+a);
        System.out.println("result:" + getData(a));
        // System.out.println("result:"+getData(a));

        // byte[] test={10,20};
        // System.out.println("bytesToHexString:"+bytesToHexString(test));
        String test = "https://lh6.googleusercontent.com/-55osAWw3x0Q/URquUtcFr5I/AAAAAAAAAbs/rWlj1RUKrYI/s1024/A%252520Photographer.jpg";
        System.out.println("bytesToHexString:" + hashKeyForDisk(test));

        System.out.println("randomNum:" + randomNum(6));
        System.out.println("evannnnn:" + getTranslateY(18.0f, 255));

        //
        // double down=10;
        // double total=20;
        //
        // String format="%i/%i";
        // String result="";
        // result=String.format(format, down,total);
        // System.out.println(result);

        // // for loop
        // for (; ; ) {
        // System.out.println("evan:");
        // }
    }

    public static int getTranslateY(float degree, int distance) {
        return Double.valueOf(-1 * distance * Math.sin(Math.toRadians(degree))).intValue();
    }

    private static int randomNum(int num) {
        Random rand = new Random();
        return Math.abs(rand.nextInt() % num);
    }

    private static byte getData(int b) {
        byte result = -1;
        result = (byte) (b >> 4);
        return result;
    }

    /**
     * A hashing method that changes a string (like a URL) into a hash suitable for using as a disk filename.
     */
    public static String hashKeyForDisk(String key) {
        String cacheKey;
        try {
            final MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(key.getBytes());
            cacheKey = bytesToHexString(mDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            cacheKey = String.valueOf(key.hashCode());
        }
        return cacheKey;
    }

    private static String bytesToHexString(byte[] bytes) {
        // http://stackoverflow.com/questions/332079
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }
}
