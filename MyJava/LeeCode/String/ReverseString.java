package LeeCode.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * NC103  反转字符串
 * Input: "hello"
 * Output: "olleh"
 */

public class ReverseString {
    /**
     * 解题思路
     * StringBuilder => reverse()
     */
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}

/**
 * BufferedReader(new InputStreamReader(System.in))
 * StringBuffer(str) -> reverse()
 */
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=in.readLine())!=null){
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}