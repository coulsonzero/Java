package Soultion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author CoulsonZero
 * @version 2021-05-31 20:29
 */
public class T1StringToArray {
    public static void main(String[] args) {
        //"ab&&2"
        String str = "ab&&2";
        String str1 = str.substring(0,str.indexOf("&&"));
        String str2 = str.substring(str.indexOf("&&")+2);
        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        System.out.println(list);

        System.out.println(Arrays.toString(new String[]{ str.substring(0, str.indexOf("&&")), str.substring(str.indexOf("&&") + 2) }));

    }
}
