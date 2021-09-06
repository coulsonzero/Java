package java.com.StringTest;

import java.util.Arrays;

public class SplitStringToArray {
    public static void main(String[] args) {
        //"ab&&2" => ["ab", "2"]
        String str = "&&ab&&2&&c&&";
        /*String[] chars = str.split("&&");
        java.JavaSE.Collection<String> list = new ArrayList<>(Arrays.asList(chars));
        System.out.println(list);*/

        String str1="&ab&&2&&g&&";
        while (str1.charAt(str1.length() - 1) == '&')
            str1 = str1.substring(0, str1.lastIndexOf('&'));
        while (str1.charAt(0) == '&')
            str1 = str1.substring(1);
        System.out.println("[" + str1.replace("&&", ", ") + "]");
        System.out.println(Arrays.toString(new String[]{ str1.replace("&&", ", ") }));
    }
}
