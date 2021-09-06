package javaSE;

/**
 * 变量、常量、枚举
 */
public class Var {
    static final double width = 10.2;          // 类常量，可在一个类中的多个方法中使用
    public static final double height = 12.2; // 公共类常量, 其他类也可用

    enum Color {BLACK, BLUE, GREEN, WHITE}   // 枚举类型

    public static void main(String[] args) {
        double salary = 12000;   // 变量
        final double PI = 3.14;  // 常量, 只能赋值一次
    }
}
