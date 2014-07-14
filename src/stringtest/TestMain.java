package stringtest;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

    private static Set<String> set = new HashSet<String>();

    public static void main(String[] args) {
        String a = "123445";
        fullArray(a, "", 0);
        System.out.println("排列总数 = " + set.size());

    }

    public static void fullArray(String a, String para, int k) {
        String result = "";
        int l = a.length();

        StringBuilder build = new StringBuilder();
        build.append(para);
        result = build.toString();

        char ch = a.charAt(k);
        String temp = result;
        for (int i = 0; i <= k; i++) {
            result = insertStr(temp, i, ch);
            if (k < l - 1)
                fullArray(a, result, k + 1);
            if (k + 1 == l) // 判断组装字符串完成
            {
                set.add(result);
                System.out.println(result);
            }
        }
    }

    /**
     * 在第key个位置,插入字符
     * 
     * @param str
     * @return
     */
    public static String insertStr(String str, int key, char ch) {

        StringBuilder builder = new StringBuilder();
        int l = str.length();
        if (key == l) // 在最后一个位置添加字符ch
        {
            builder.append(str);
            builder.append(ch);
        } else {
            builder.append(str.substring(0, key));
            builder.append(ch);
            builder.append(str.substring(key));
        }
        return builder.toString();
    }

}
