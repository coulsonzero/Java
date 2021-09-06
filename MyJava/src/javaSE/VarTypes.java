package javaSE;

/**
 * 基本数据类型：
 * 整型: byte short int long
 * 浮点型: float double
 * char
 * boolean: true  false
 * Unicode: (美)ASCII (西欧)ISO  (中)GBK  UTF-8  UTF-16
 */
public class VarTypes {
    public static void main(String[] args) {
        // 整数
        int age = 20;
        byte a = 127;                // -128 ~ 127
        short b = 32767;             // -32768 ~ 32767
        long num = 10_000_000_000L;  // plus "L"

        // 浮点型
        float PI = 3.14F;           // plus "F/f", 精度6-7位有效数字，很多情况下不能满足需求
        double price = 12.5;        // 可以plus "D/d": 12.5D

        // char
        char c = '\"';               // 单引号

        // boolean
        boolean isMan = true;
    }
}
