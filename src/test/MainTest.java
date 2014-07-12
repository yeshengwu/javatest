package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

public class MainTest {

    public static void main(String[] args) {
        System.out.println("SubBase");
        int a[] = { 1, 2, 3, 4 };
        System.out.println("binarySearch:" + binarySearch(a, 0, a.length, 1));

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

}
