package genericity;

// ʹ���˷���
/**
 * @author
 * @date 2013-8-3
 * @version 1.0.0
 * @Description: http://baike.baidu.com/view/1436058.htm java����
 */
public class Gen<T> {
    private T ob; // ���巺�ͳ�Ա����

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("T��ʵ��������: " + ob.getClass().getName());
    }
}
