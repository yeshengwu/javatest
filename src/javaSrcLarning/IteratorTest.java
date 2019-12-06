package javaSrcLarning;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

    static LinkedList<String> list = new LinkedList<String>();
    static String[] arrays = { "1", "2", "3", "4", "5" };
    static Iterator<String> it;

    public static void main(String[] args) {
        IteratorTest t = new IteratorTest();
        for (int i = 0; i < 5; i++) {
            list.add(arrays[i]);// 把数组的元素都添加到链表
        }
        // t.useLinkedList(list);
        t.useIterator(list, it);
    }

    // 链表的使用
    public void useLinkedList(LinkedList<String> list)
    {
        System.out.println("操作前的长度:" + list.size());// 打印出链表的长度

        System.out.println("此列表的头（第一个元素）为:" + list.peek());/* peek() 找到但不移除此列表的头（第一个元素）。 */

        System.out.println("查找后的长度:" + list.size());

        System.out.println("移除的元素为:" + list.poll()); /* poll() 找到并移除此列表的头（第一个元素）。 */

        System.out.println("移除后的长度:" + list.size());

        System.out.println("返回第一个元素:" + list.getFirst());// getFirst() 返回此列表的第一个元素。

        System.out.println("返回最后一个元素:" + list.getLast());// getLast() 返回此列表的最后一个元素。

        if (list.contains("4"))// boolean contains(Object o) 如果此列表包含指定元素，则返回 true。
            System.out.println("存在此元素");
        else
            System.out.println("不存在此元素");

    }

    // 迭代器的使用
    public void useIterator(LinkedList<String> list, Iterator<String> it)
    {
        it = list.iterator();
        // 将链表的元素迭代出并打印
        while (it.hasNext())
            System.out.print(it.next() + "\t");
    }

}
