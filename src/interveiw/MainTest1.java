package interveiw;

public class MainTest1 {
    public static void main(String[] args) {

        String testString = "uuid=xxxx1,ip=1x.x.x.x\r\nuuid=xxxx2,ip=2x.x.x.x";
        // String testString="uuid=xxxx1,ip=1x.x.x.x uuid=xxxx2,ip=2x.x.x.x";

        System.out.println(testString);

        // String[] splitString=testString.split("\r\n");
        // System.out.println("lenght:"+splitString.length);
        // for (int i = 0; i < splitString.length; i++) {
        // System.out.println(splitString[i]);
        // }
        //
        String teString = "012345";
        System.out.print("ff:" + teString.substring(0, 6));
        System.out.println("round:" + Math.round(11.8));

        // short s1 = 1; s1 += 1;
        short s1 = 1;
        s1 = (short) (s1 + 1);
        System.out.println("s1 += 1:" + s1);

        // ����Ч����ͨ����λ����
        int i = 2;
        int resust = i << 3;
        System.out.println("2����8��" + resust);

    }
}
