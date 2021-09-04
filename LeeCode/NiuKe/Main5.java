package NiuKe;

/**
 * @author CoulsonZero
 * @version 2021-05-23 16:48
 */
public class Main5 {
    public static void main(String[] args) {
        int a = 1;
        //无return和返回值则无法打印结果, 更无法调用
//        System.out.println(change1(a));
//        change1(b);
//        System.out.println(b+1);

        change2(a);
        System.out.println(change2(a));
        System.out.println(change2(40));

    }
    public static void change1(int b) {
        b = 10;
    }
    public static int change2(int a) {
        a = 20;
        return a;
    }
}
