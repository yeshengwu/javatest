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

    // override ������Ե��ø����ͬ���������Լ�Ҳ�����ڸ���ʱ�������������
    // ����Ҳ���Բ����ø����ͬ���������Լ���ȫ���Ǹ���ͬ������
    @Override
    public void put() {
        // TODO Auto-generated method stub
        super.put();
        // ���ø��෽����û���ø��෽�������� getSize()�����ĵ������⣬getSize()�ڸ����б������ˣ�
        // �����Լ�û�е�����
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
