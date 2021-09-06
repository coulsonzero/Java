package java.com.RegularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author CoulsonZero
 * @version 2021-05-26 18:45
 */
public class StringDemo {
    public static void main(String[] args) {
        // String -> ArrayList<String>
        //"ab&&22" => "ab", "2" => ["ab", "2"]
        String str = "ab&&22";
        String str1 = str.substring(0, str.indexOf("&&"));
        String str2 = str.substring(str.indexOf("&&")+2);
        //法一
        System.out.print("[" + str1 + "," + str2 + "]");
        System.out.println();
//        StringBuilder sb = new StringBuilder(str);
//        String str1 = sb.substring(0,str.indexOf("&&"));
//        String str2 = sb.substring(str.indexOf("&&")+2, str.length());

        //法二
        ArrayList<String> array = new ArrayList<>();
        array.add(str1);
        array.add(str2);
        System.out.println(array);


        //ArrayDemo => String
        //["ab","2"] -> "ab&&2"
        String[] arr = {"ab","2"};
        //法一
        System.out.println(arr[0] + "&&" + arr[1]);
        //法二
        LinkedList<String> linklist = new LinkedList<>(Arrays.asList(arr));
        linklist.add(1,"&&");
//        System.out.println(linklist);     //[ab, &&, 2]
        Iterator<String> iter = linklist.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next());  //"ab&&2"
        }
    }
}
