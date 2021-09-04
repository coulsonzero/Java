package NiuKe;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 提取不重复的整数
 * @author CoulsonZero
 * @version 2021-05-18 23:17
 *
 * 题目描述：
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是0。
 */

public class Main1 {
    public static void main(String[] args){
        //1.输入一个int型整数
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //2.创建可变字符串StringBuffer
        StringBuffer sb = new StringBuffer(str);
        //按照从右向左的阅读顺序
        sb.reverse();

        //集合Set：返回一个不含重复数字的新的整数
        Set s = new HashSet();
        //遍历
        for(int i=0;i<sb.length();i++){
            if(s.add(sb.substring(i,i+1))){
                System.out.print(sb.substring(i,i+1));
            }
        }
    }
}
