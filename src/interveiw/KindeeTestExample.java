package interveiw;

/**
 * @author Evan.Ye
 * @date 2013-7-17
 * @version 1.0.0
 * @Description: ����������Ŀ��֤
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
        	//û��break Ҳһ��ִ�� ��� zero
        }*/
        //
        // KindeeTestExample example=new KindeeTestExample();
        // KindeeB foo=example.new KindeeB();
        // example.test(foo);

        // java ���Ͽ��Դ��ѧϰ
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
