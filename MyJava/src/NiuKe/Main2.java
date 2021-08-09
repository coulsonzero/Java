package NiuKe;

/**
 * @author CoulsonZero
 * @version 2021-05-21 0:47
 * @字符串反转
 * @题目描述：接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 */
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        //1.接收一个只包含小写字母的字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //2.然后输出该字符串反转后的字符串
        StringBuffer sb= new StringBuffer(str.toLowerCase());
        System.out.println(sb.reverse());
    }
}


    /**
     * python3解法：
     * print(input()[::-1])
     */

