package genericity.noGen;

public class Gen2 {
    private Object ob; // ����һ��ͨ�����ͳ�Ա

    public Gen2(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public void showTyep() {
        System.out.println("T��ʵ��������: " + ob.getClass().getName());
    }
}
