package genericity.noGen;

public class GenDemo2 {
    public static void main(String[] args) {
        // ������Gen2��һ��Integer�汾
        Gen2 intOb = new Gen2(new Integer(88));
        intOb.showTyep();
        int i = (Integer) intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("---------------------------------");
        // ������Gen2��һ��String�汾
        Gen2 strOb = new Gen2("Hello Gen!");
        strOb.showTyep();
        String s = (String) strOb.getOb();
        System.out.println("value= " + s);
    }
}
