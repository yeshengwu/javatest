package interveiw;

public class Main {
    public static void main(String[] args) {
        System.out.println("result:" + Boolean.valueOf("tru"));
        getInt(a);

        // try {
        // new UdpClient().init();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        int values = -96;
        String binString = Integer.toBinaryString(values);
        System.out.println("binString-->  " + binString);
        int length = binString.length();
        String high4 = binString.substring(length - 8, length - 4);
        System.out.println("debug1" + "high4-->  " + high4);
        String temp = high4 + "0000";
        System.out.println("debug1" + "temp-->  " + temp);
        byte batt = (byte) Integer.parseInt(temp + 32);
        // byte batt=(byte) Integer.parseInt(high4);
        byte result = (byte) (batt & 0x0F);
        System.out.println("debug1" + "batt-->  " + batt);
        System.out.println("debug1" + "result-->  " + result);

    }

    static int[] a = new int[] { 0, 1, 2, 3, 4, 5 };

    static int[] getInt(int[] a) {
        for (int i = 0; i <= (a.length) / 2; i++) {
            for (int j = 0; j < 2; j++) {
                // (((a.length)/2)+1)*2-1
                System.out.println("convert:" + a[(i + 1) * j]);
            }
        }

        return null;
    }

}
