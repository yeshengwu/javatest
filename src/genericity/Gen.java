package genericity;

// 使用了泛型
/**
 * @author
 * @date 2013-8-3
 * @version 1.0.0
 * @Description: http://baike.baidu.com/view/1436058.htm java泛型
 */
public class Gen<T> {
    private T ob; // 定义泛型成员变量

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
        System.out.println("T的实际类型是: " + ob.getClass().getName());
    }
}
