package java.com.StringTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CoulsonZero
 * @version 2021-05-31 14:26
 */
public class SringDemo1 {

    public static void main(String[] args) {
        String str = "ab&&2&&c";
        String str1 = str.substring(0,str.indexOf("&&"));
        String str2 = str.substring(str.indexOf("&&")+2);
        List<String> list = new ArrayList<>();
//        list.add(str1);
//        list.add(str2);
//        System.out.println(list);

        String str3 = str.replace("&&", ",");
        /*char[] chars = str3.toCharArray();
//        int j = 0;
        for (int i = 0, j=2; i< chars.length; i++,j=i+2){
            if (chars[i] == chars[j] && chars[i] == '&') {

            }
        }*/
    }
}
