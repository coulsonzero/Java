package JavaSE.Operator;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 13:39
 */
public class EqualsDemo2 {
    public static void main(String[] args) {
        //字符串比较
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);       //false 比较内存地址
        System.out.println(a.equals(b));  //true  比较内容


        int c = 2;
        int d = 2;
        System.out.println(c == d); //true
        //无法用equals比较

    }
}
