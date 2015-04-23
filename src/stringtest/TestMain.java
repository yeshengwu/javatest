package stringtest;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String args[])
    {
       /* int val;
        StringBuffer sb1, sb2;

        val = 10;
        sb1 = new StringBuffer("apples");
        sb2 = new StringBuffer("pears");
        System.out.println("val is " + val);
        System.out.println("sb1 is " + sb1);
        System.out.println("sb2 is " + sb2);
        System.out.println("***********************");
        System.out.println("calling modify");
        // 按值传递所有参数
        modify(val, sb1, sb2);
        System.out.println("returned from modify");
        System.out.println("***********************");

        System.out.println("val is " + val);
        System.out.println("sb1 is " + sb1);
        System.out.println("sb2 is " + sb2);*/
        
        int val;
        List<String> sb1, sb2;

        val = 10;
        sb1 = new ArrayList<String>();
        sb1.add("apples");
        sb2 = new ArrayList<String>();
        sb2.add("pears");
        System.out.println("val is " + val);
        System.out.println("sb1 is " + sb1);
        System.out.println("sb2 is " + sb2);
        System.out.println("***********************");
        System.out.println("calling modify");
        // 按值传递所有参数
        modifyList(val, sb1, sb2);
        System.out.println("returned from modify");
        System.out.println("***********************");

        System.out.println("val is " + val);
        System.out.println("sb1 is " + sb1);
        System.out.println("sb2 is " + sb2);
    }

    public static void modify(int a, StringBuffer r1, StringBuffer r2)
    {
        a = 0;  // 基本变量还是按值传递
//        r1 = r2; // 引用一样是按值传递，其作用域是有限制的,不是把r2的地址给r1，赋予的只是一个引用变量。
        r2.append(" taste good");// 操纵原对象的值。
//        r1 = r2;
        r1.append(" r1 append");
//        StringBuffer new1=r1;
        StringBuffer new1=new StringBuffer();
        new1.append(" new1 append");
        r1=new1;
        
        System.out.println("方法中a is " + a);
        System.out.println("方法中r1 is " + r1);
        System.out.println("方法中r2 is " + r2);
    }
    
    public static void modifyList(int a, List<String> r1, List<String> r2)
    {
        a = 0;  // 基本变量还是按值传递
//        r1 = r2; // 引用一样是按值传递，其作用域是有限制的,不是把r2的地址给r1，赋予的只是一个引用变量。
        r2.add(" taste good");// 操纵原对象的值。
//        r1 = r2;
        r1.add(" r1 append");
//         List<String> new1=r1;
        List<String> new1=new ArrayList<String>();
//        new1=r1;
        new1.add(" new1 append");
        r1=new1;
        
        System.out.println("方法中a is " + a);
        System.out.println("方法中r1 is " + r1);
        System.out.println("方法中r2 is " + r2);
    }

}
