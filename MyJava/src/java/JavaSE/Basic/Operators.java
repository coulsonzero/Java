package java.JavaSE.Basic;

/**
 * Operators (运算符)
 *
 * Arithmetic: + - * / %
 * Assignment: += -= *= /= %=
 * Logical: && || !
 * Relational: == != < > <= >=
 * Incerment/Decerment: x++  x--  ++x  --x
 * Bit: &  |  ^  ~  >>  <<  >>>
 * Ternary if-else operator： ?
 */
public class Operators {
    public static void main(String[] args) {
        // Arithmetic
        System.out.println(1 + 2 + "hello");   //"3hello"
        System.out.println(2.0 - 1.1);     //0.8999999999999999  <-- 浮点数采用二进制系统表示，而在二进制系统中无法精确地表示分数1/10
        System.out.println(2.0 - 1.2);    //0.8
        System.out.println(12 / 5);    //2
        System.out.println(12.0 / 5); //2.4

        // Assignment
        int a = 2;  //必须初始化
        a += 6.2;
        System.out.println(a);                  //8  --> 损失精度
        System.out.println((double) a + 2.4);   //10.4  --> 强制转换

        // Logical
        boolean b = a > 2 && a < 10;        // 短路原理
        boolean c = a > 2 || a < 1;
        boolean d = !(a == 2);

        // Incerment/Decerment
        int x = 1, y = 1;
        int e = 2 * ++x;  // now x is 2, so e is 4.
        int f = 2 * y++;  // y is 1, so f is 2.  then y is 2.
        int g = 2 * ++y;  // now y is 3, so f is 4.
        System.out.printf("%d, %d, %d", e, f, g);  //4, 2, 6

        // Ternary if-else operator
        int z = x > y ? 1 : 2;
    }
}
