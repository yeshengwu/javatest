package algorithm;

public class TestString {

    public static void main(String[] args) {

        // String teString="helol";
        // String result="";
        //
        // int maxIndex=-1;
        // int count=-1;
        //
        // for (int i = 0; i < teString.length(); i++) {
        // // char temp=teString.charAt(i);
        // // System.out.println("temp="+temp);
        //
        // for (int j = 0; j < teString.length(); j++) {
        // if(teString.charAt(j)==teString.charAt(i)){
        // System.out.println("i="+i+" j="+j);
        //
        //
        // }
        // }
        //
        //
        // }

        String s = "heloloo"; // ��ͳ���ַ���
        int max = 0; // ��¼�����ִ���
        int[] cnt = new int[127]; // ��ʱ�����õ�����
        for (int i = 0; i < s.length(); i++) { // ѭ���ַ�����ͳ��
            char c = s.charAt(i); // ȡ��������ĸ
            max = (++cnt[c] > max) ? cnt[c] : max; // ��������������ִ���
        }
        System.out.println(max);

        // String str = "afdbsodfusdfalgaufaowejhnlgjaouowejhgajgabcdefghijklmnopqrstuvwxyz";
        // int[] sum = new int[52];
        // int max = 0;
        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // if (c >= 65 && c <= 90)//A~Z
        // sum[c - 65]++;
        // else if (c >= 97 && c <= 122)//a~z
        // sum[c - 71]++;
        // else
        // continue;
        // }
        // for (int i = 0; i < sum.length; i++)
        // if (sum[i] > max)
        // max = sum[i];
        // System.out.println(max);

    }

}
