package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * effective java item 40 慎用重载
 * 
 * @author admin
 * 
 */
public class CollectionClassifierTest {
    // public static String classfy(Set<?> s) {
    // return "Set";
    //
    // }
    //
    // public static String classfy(List<?> s) {
    // return "List";
    //
    // }

    public static String classfy(Collection<?> s) {
        if (s instanceof Set) {
            return "Set";
        } else if (s instanceof List) {
            return "List";
        }
        return "unknown collection";

    }

    public static void main(String[] args) {
        // 书本实例代码
        // Collection<?>[] collections = { new HashSet<String>(), new ArrayList<BigInteger>(),
        // new HashMap<String, String>().values() };
        //
        // for (Collection<?> c : collections) {
        // System.out.println(classfy(c));
        // }

        // 书本实例代码
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            // list的remove方法思路
            // -3 -2 -1 0 1 2 移除第0个位置的元素后： -2 -1 0 1 2
            // 再在 -2 -1 0 1 2 移除第1个位置的元素后：-2 0 1 2
            // 再在 -2 0 1 2 移除第2个位置的元素后：-2 0 2
            list.remove(i); // 改进 list.remove((Integer)i); list.remove((Integer.valueOf(i))

            set.remove(i);
        }
        System.out.println("list:" + list); // [-2, 0, 2] 开始以为是 0 1 2，这是错误的
        System.out.println("set:" + set); // [-3, -2, -1]
    }
}
