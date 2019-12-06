package genericitytest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionGenFooDemo {
    public static void main(String args[]) {
        CollectionGenFoo<ArrayList<?>> listFoo = null;
        listFoo = new CollectionGenFoo<ArrayList<?>>(new ArrayList());
        // 出错了,不让这么干。
        // 原来作者写的这个地方有误，需要将listFoo改为listFoo1
        // CollectionGenFoo<Collection> listFoo1 = null;
        // listFoo1=new CollectionGenFoo<ArrayList>(new ArrayList());

        // 现在不会出错了
        // 原来作者写的这个地方有误，需要将listFoo改为listFoo1
        CollectionGenFoo<? extends Collection> listFoo1 = null;
        listFoo1 = new CollectionGenFoo<ArrayList<?>>(new ArrayList());

        System.out.println("实例化成功!");
    }
}
