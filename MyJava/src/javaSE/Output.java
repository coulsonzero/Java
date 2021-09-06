package javaSE;

/**
 * Output
 */
public class Output {
    public static void main(String[] args) {
        System.out.print("What is your name ? ");   //不换行
        System.out.println("hello");               //自动换行
        System.out.printf("%d  %,.2f  %s  \n", 12, 10000.0/3, "hello");  //格式化输出, \n换行

        String message = String.format("Hello %s, Are you %d years old ?", "coulson", 24);  //格式化字符串
        System.out.println(message);
    }
}
