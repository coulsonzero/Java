package java.JavaSE.Collection;

import java.util.LinkedList;

/**
 * @author coulson
 * @version 2021-08-04 22:44
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(2); // 头部添加
        linkedList.addLast(4);  // 尾部添加

        /*

        size()

        add()
        addFirst()
        addLast()
        remove()
        removeFirst()
        removeLast()
        get()
        getFirst()
        getLast()
        set()
         */

        System.out.println(linkedList);
    }
}
