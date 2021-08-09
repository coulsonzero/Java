package JavaSE.Collection;

import java.util.TreeSet;

/**
 * @author coulson
 * @version 2021-08-04 23:05
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(8);
        treeSet.add(1);
        treeSet.remove(1);


        System.out.println(treeSet);
    }
}
