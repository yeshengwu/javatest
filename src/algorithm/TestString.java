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

        String s = "heloloo"; // 待统计字符串
        int max = 0; // 记录最大出现次数
        int[] cnt = new int[127]; // 临时计数用的数组
        for (int i = 0; i < s.length(); i++) { // 循环字符以做统计
            char c = s.charAt(i); // 取出单个字母
            max = (++cnt[c] > max) ? cnt[c] : max; // 计数并检测最大出现次数
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
