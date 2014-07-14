package interveiw;

/**
 * @author Evan.Ye
 * @date 2013-7-17
 * @version 1.0.0
 * @Description: 笔试题中题目验证
 */
public class ChangeExample {
    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };

    public static int x = 100;

    public static void main(String args[]) {
        ChangeExample ex = new ChangeExample();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);

        ChangeExample a = new ChangeExample();
        ChangeExample b = new ChangeExample();
        if (a == b)
            System.out.println("  a==b");
        else
            System.out.println("  a!=b");

        ChangeExample h1 = new ChangeExample();
        h1.x++;
        ChangeExample h2 = new ChangeExample();
        h2.x++;
        h1 = new ChangeExample();
        h1.x++;
        ChangeExample.x--;
        System.out.println("static x=" + x);
        // 按位异或。比如二进制 1001 ^ 1100 = 0101
        // 0^0=0，1^1=0 ，1^0 = 1，0^1=1。
        System.out.print("67^3=" + (67 ^ 3)); // 64
        // 按位 与
        System.out.println("  67&3=" + (67 & 3)); // 3

    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}
