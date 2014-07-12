package javaSrcLarning;

import java.text.DateFormat;
import java.util.StringTokenizer;

public class MainTest {

    private static float a = 250f;

    private String mData = "evan";

    public static void main(String[] args) {
        // for (int i = 4; i >= 2; i--) {
        // System.out.println(i);
        // }
        //
        // System.out.println(stringCut("上海市$直辖市$黄浦区"));
        // System.out.println("t="+isA());
        //
        // long tt=86400 * 1000;
        // System.out.println("time="+getUnixDateToDate(tt, true));

        MainTest mainTest = new MainTest();
        mainTest.parseData();
        System.out.println(mainTest.mData);
        System.out.println("evan=" + Integer.valueOf(10).hashCode());

        // int num=-3;
        // System.out.println("asset before");
        // assert num>0;
        // System.out.println("asset after");

        boolean show = false;
        boolean data = true;
        show |= data;
        System.out.println("result=" + show);

        boolean mDelete = true;
        boolean mBatch = true;

        System.out.println("test0=" + (!mDelete & !mBatch));
        // System.out.println("test0=" + !(mDelete | mBatch));
        System.out.println("test1=" + (!mDelete || !mBatch));

        int[] a = new int[] { 1, 3, 4, 5 };
        int i = 0, flag = 0, len = 0;
        String[] B = new String[a.length];
        for (i = 0; i < a.length - 1; i++) {
            if (a[i + 1] != a[i] + 1) {
                if (i == flag) {
                    B[len] = a[i] + "";
                } else {
                    B[len] = "" + a[flag] + "-" + a[i];
                }
                len++;
                flag = i + 1;

                if (i + 1 == a.length - 1) {
                    B[len] = "" + a[i + 1];
                }

            } else {
                if (i + 1 == a.length - 1) {
                    B[len] = "" + a[flag] + "-" + a[i + 1];
                }
            }
        }
        for (String string : B) {
            System.out.println(string);
        }

    }

    public void parseData() {
        String data = mData;
        String concatString = data.concat("concat");
        System.out.println("parseData=" + data + " | concat=" + concatString);
        // mData=null;
        String aString = this.mData;
    }

    public static boolean isA() {
        int i = 20;
        int j = 30;
        if (a > (i * 10) && a < (j * 10)) {
            return true;
        }
        return false;
    }

    /**
     * @return unixdate:1362217847000
     */
    public static String getUnixDateToDate(long unxiDate, boolean isGengzao) {
        DateFormat df = null;
        if (isGengzao) {
            df = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        } else {
            df = new java.text.SimpleDateFormat("HH:mm");
        }
        String date = df.format(new java.util.Date(unxiDate));
        return date;
    }

    /**
     * 字符串截取
     * 
     * @param str1
     * @return
     */

    public static String stringCut(String str1) {
        String address1 = null;
        StringTokenizer token = new StringTokenizer(str1, "$");
        String[] add = new String[3];
        int i = 0;
        while (token.hasMoreTokens()) {
            add[i] = token.nextToken();
            i++;
            address1 = add[0] + add[1];

        }
        return address1;
    }

}
