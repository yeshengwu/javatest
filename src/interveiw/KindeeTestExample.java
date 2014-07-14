package interveiw;

/**
 * @author Evan.Ye
 * @date 2013-7-17
 * @version 1.0.0
 * @Description: 笔试题中题目验证
 */
public class KindeeTestExample {

    public static void main(String args[]) {
        /*int i = 8;
        switch (i) {
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;

        default:
            System.out.println("zero");
            //没有break 也一样执行 输出 zero
        }*/
        //
        // KindeeTestExample example=new KindeeTestExample();
        // KindeeB foo=example.new KindeeB();
        // example.test(foo);

        // java 集合框架源码学习
        // ArrayList<String> teStrings=new ArrayList<String>();
        // teStrings.add("test");
        // Object[] array=teStrings.toArray();
        // for (int i = 0; i < array.length; i++) {
        // System.out.println("i="+array[i]);
        // }
        // HashMap<K, V>

    }

    class KindeeA extends KindeeTestExample {
    }

    class KindeeB extends KindeeTestExample {
    }

    void test(KindeeB foo) {
        KindeeTestExample testExample = foo;
    }

}
