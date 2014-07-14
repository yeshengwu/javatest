package javaSrcLarning;

import java.util.ArrayList;

public class SubBaseCache extends BaseCache {

    private int a;
    private int b;

    public SubBaseCache(int a) {
        this(a, 0);
    }

    public SubBaseCache(int a, int b) {
        super(a);
        this.a = a;
        this.b = b;
    }

    // override 子类可以调用父类的同名方法，自己也可以在覆盖时加上子类的特性
    // 子类也可以不调用父类的同名方法，自己完全覆盖父类同名方法
    @Override
    public void put() {
        // TODO Auto-generated method stub
        super.put();
        // 调用父类方法和没调用父类方法区别是 getSize()方法的调用问题，getSize()在父类中被调用了，
        // 子类自己没有调用它
        System.out.println("SubBaseCache->put a:" + a);
    }

    @Override
    protected int getSize() {
        // TODO Auto-generated method stub
        return 100;
    }

    public static void main(String[] args) {
        SubBaseCache subBaseCache = new SubBaseCache(10);
        subBaseCache.put();
        ArrayList<String> teArrayList = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            teArrayList.add("i" + i);
        }
        // for (int i = 0; i < teArrayList.size(); i++) {
        // System.out.println("test:"+teArrayList.get(i));
        // }
        for (int i = teArrayList.size() - 1; i >= 0; i--) {
            System.out.println("test:" + teArrayList.get(i));
        }

    }

}
