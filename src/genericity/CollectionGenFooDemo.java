package genericity;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenFooDemo {
    public static void main(String args[]) {
        CollectionGenFoo<ArrayList> listFoo = null;
        listFoo = new CollectionGenFoo<ArrayList>(new ArrayList());
        // ������,������ô�ɡ�
        // ԭ������д������ط�������Ҫ��listFoo��ΪlistFoo1
        // CollectionGenFoo<Collection> listFoo1 = null;
        // listFoo1=new CollectionGenFoo<ArrayList>(new ArrayList());

        // ���ڲ��������
        // ԭ������д������ط�������Ҫ��listFoo��ΪlistFoo1
        CollectionGenFoo<? extends Collection> listFoo1 = null;
        listFoo1 = new CollectionGenFoo<ArrayList>(new ArrayList());

        System.out.println("ʵ�����ɹ�!");
    }
}
