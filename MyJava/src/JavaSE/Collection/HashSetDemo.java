package JavaSE.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author coulson
 * @version 2021-08-04 22:50
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        /*
        add()
        remove()
         */
        set.add(1);
        set.add(5);
        set.add(1);
        System.out.println(set);    // [1, 5]

        boolean a = set.add(5);  // false 重复会报错
        System.out.println(a);
        // 迭代
        for (Integer integer : set) {
            System.out.println(integer);
        }

        Iterator< Integer > iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
