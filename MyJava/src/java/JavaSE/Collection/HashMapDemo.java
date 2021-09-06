package java.JavaSE.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coulson
 * @version 2021-08-04 22:59
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);       // 增
        map.put(3,7);
        map.remove(1);
        System.out.println(map.get(3)); // 7
        map.replace(3,6);   // 删

        System.out.println(map);    // {1=2}
    }
}
