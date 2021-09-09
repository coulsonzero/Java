package java.JavaSE.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String name = "shville";
        // 查
        int len          = name.length();
        int index        = name.indexOf("v");
        char h           = name.charAt(3);
        String s1        = name.substring(1, 5);
        String s2        = name.toString();
        //改
        String s3        = name.replace("vi", "re");
        String s4        = "hello ".concat(name);          //hello shville
        String s5        = String.join(",", "hello", "coulson");
        String s6        = name.toUpperCase();
        String s7        = name.toLowerCase();
        //数组
        String[] arr     = name.split("h");
        char[] chars     = name.toCharArray();
        byte[] bytes     = name.getBytes();
        //判断
        boolean equals   = name.equals(s1);
        boolean b        = name == s1;
        boolean contains = name.contains("e");
        boolean empty    = name.isEmpty();
        boolean start    = name.startsWith("sh");
        boolean end      = name.endsWith("sh");


        String str = "134";
        // String -> Integer
        int num = Integer.parseInt(str);
        // Integer -> String
        String str2 = String.valueOf(num);
        String str3 = Integer.toString(num);

        //String -> CharArray
        char[] charArray = str.toCharArray();
        //Array => String
        String str4 = Arrays.toString(charArray);

    }
}
