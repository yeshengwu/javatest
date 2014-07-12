package innerClass;

import innerClass.OutClass1.InnerStaticClass1;

public class Test1 {
    public static void main(String[] args) {
        // OutClass1 oc = new OutClass1();
        // InnerStaticClass1 ic = new InnerStaticClass1();
        // evan changed
        OutClass1 oc = new OutClass1(0, "outName");
        System.out.println("OutClass->getValue:" + oc.getValueOut());
        System.out.println("OutClass->testFinally:" + oc.testFinally());

        InnerStaticClass1 ic = new InnerStaticClass1(1, "inName");
        System.out.println("InClass->getValue:" + ic.getValueIn());
    }
}
