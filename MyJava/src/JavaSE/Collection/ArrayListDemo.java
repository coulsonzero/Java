package JavaSE.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author coulson
 * @version 2021-08-04 21:56
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,2,3));
        // List<Integer> list = new ArrayList<>();
        // JavaSE.Collection<Integer> list = new ArrayList<>();
        /*
        创建：new ArrayList<>()
        转换：Arrays.asList()
        排序：Collections.sort()
        输出：System.out.println(list);
        长度：size()

        增：add(e), add(i, e)
        删：remove(e), remove(i)
        查：get(i)
        改：set(i, e)
         */


        // 增
        list.add(1);
        Collections.addAll(list, 1, 2);
        // 删
        list.remove(3);
        // 查
        System.out.println(list.size());
        System.out.println(list.get(2));
        Collections.sort(list);
        System.out.println(list);
        // 改
        list.set(0,9);
        System.out.println(list);


        // 迭代
        Iterator< Integer > iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
