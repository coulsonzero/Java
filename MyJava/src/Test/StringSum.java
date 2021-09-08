import java.util.Scanner;

/**
 * 输入2个整数, 用'/'分隔, 反转整数并输出它们的和
 *
 * @author coulson
 * @version 2021-09-08 18:38
 */
public class StringSum {
    public static void main(String[] args) {
        System.out.print("请输入2个整数, 并用'/'隔开(\"123/456\"): ");
        String str = new Scanner(System.in).nextLine();
        // String str = "123/456";
        System.out.println(TwoIntSum(str));
    }
    public static int TwoIntSum(String str) {
        String s = new StringBuilder(str).reverse().toString();
        String[] split = s.split("/");
        int res = 0;
        for (String v : split) { res += Integer.parseInt(v); }
        return res;
    }
}
