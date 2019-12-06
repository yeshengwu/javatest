package javaSrcLarning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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

        int[] a = new int[]{1, 3, 4, 5};
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

        System.out.println("SubBase");
        int aaa[] = {1, 2, 3, 4};
        System.out.println("binarySearch:" + binarySearch(a, 0, aaa.length, 1));

        double ee = 1e2;// 100.0
        System.out.println(ee);
        String score = "10.1";
        System.out.println("score index=" + score.indexOf(".") + " len:" + score.length());

        String fileName = "lib/armabi/libdownloadengine.so.properties";

        int index = fileName.indexOf("/");
        // String pahtString=fileName.su
        System.out.println("index:" + index);

        if (fileName.contains("lib/armabi/")) {
            System.out.println("find:");
        }

        float ff = 12.3f;
        float fd = (float) 12.3;
        System.out.println("ff=" + ff + "  fd=" + fd);

        char ch;
        ch = 'a';// 使用单引号 也可以用ch=97这样的整数来进行赋值，输出也为a
        System.out.println(ch);

        /*//对于 非运行时异常（Checked Exception）则必须要处理，可以调用者处理或者继续往下抛异常
        //本例中FileNotFoundException 是非运行时异常(extends Exception)，要处理
        //对于运行时异常则会直接crash
        try {
            execute();
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }*/

        // java 字节流与字符流的区别
        // http://blog.csdn.net/cynhafa/article/details/6882061
        // 第1步：使用File类找到一个文件
        File f = new File("d:" + File.separator + "test.txt"); // 声明File 对象
        // 第2步：通过子类实例化父类对象
        OutputStream out = null;
        // 准备好一个输出的对象
        try {
            out = new FileOutputStream(f);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 通过对象多态性进行实例化
        // 第3步：进行写操作
        String str = "Hello World!!!";
        // 准备一个字符串
        byte b[] = str.getBytes();
        // 字符串转byte数组
        try {
            out.write(b);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 将内容输出
        // 第4步：关闭输出流
        // out.close();
        // 此时没有关闭

        // // 第1步：使用File类找到一个文件
        // File f = new File("d:" + File.separator + "test.txt");// 声明File 对象
        // // 第2步：通过子类实例化父类对象
        // Writer out = null;
        // // 准备好一个输出的对象
        // try {
        // out = new FileWriter(f);
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // // 通过对象多态性进行实例化
        // // 第3步：进行写操作
        // String str = "Hello World!!!";
        // // 准备一个字符串
        // try {
        // out.write(str);
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // // 将内容输出
        // // 第4步：关闭输出流
        // // out.close();
        // // 此时没有关闭 字符流 基于内存缓存区，没有close不会写入文件
        // // try {
        // // out.flush(); //清空缓冲区，强制写入文件
        // // } catch (IOException e) {
        // // // TODO Auto-generated catch block
        // // e.printStackTrace();
        // // }
        // java 字节流与字符流的区别 end

    }

    public static void execute() throws FileNotFoundException {
        System.out.println("execute...");
        throw new FileNotFoundException();
    }

    // get from android SparseArray binarySearch
    private static int binarySearch(int[] a, int start, int len, int key) {
        int high = start + len, low = start - 1, guess;

        while (high - low > 1) {
            guess = (high + low) / 2;

            if (a[guess] < key)
                low = guess;
            else
                high = guess;
        }

        if (high == start + len)
            return ~(start + len);
        else if (a[high] == key)
            return high;
        else
            return ~high;

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
