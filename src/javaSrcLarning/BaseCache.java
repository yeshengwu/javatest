package javaSrcLarning;

public abstract class BaseCache {

    private int a;

    public BaseCache(int a) {
        this.a = a;
    }

    public void put() {
        a += getSize();
        System.out.println("BaseCache->put a:" + a);
    }

    protected abstract int getSize();
}
