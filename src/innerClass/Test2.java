package innerClass;

import innerClass.OutClass2.InnerClass2;

public class Test2 {
    public static void main(String[] args) {
        // OutClass2 oc = new OutClass2();
        // OutClass2.InnerClass2 ic = oc.new InnerClass2();

        // evan changed
        OutClass2 oc = new OutClass2(0, "outName");
        System.out.println("OutClass->getValue:" + oc.getValueOut());

        InnerClass2 ic = oc.new InnerClass2(1, "inName");
        System.out.println("InClass->getValue:" + ic.getValueIn());
    }
}
