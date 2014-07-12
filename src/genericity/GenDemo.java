package genericity;

public class GenDemo {
    public static void main(String[] args) {
        // ���巺����Gen��һ��Integer�汾
        Gen<Integer> intOb = new Gen<Integer>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("----------------------------------");
        // ���巺����Gen��һ��String�汾
        Gen<String> strOb = new Gen<String>("Hello Gen!");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value= " + s);
    }
}
