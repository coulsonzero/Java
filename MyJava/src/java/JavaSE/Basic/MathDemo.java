package java.JavaSE.Basic;

public class MathDemo {
    public static void main(String[] args) {
        //向上取整
        int a  = (int) Math.ceil(7.3);   //8
        int a2 = (int) Math.ceil(7.7);   //8
        //向下取整
        int b  = (int) Math.floor(7.3);  //7
        int b2 = (int) Math.floor(7.7);  //7
        //四舍五入
        int c  = (int) Math.round(7.3);  //7
        int c2 = (int) Math.round(7.7);  //8
        //随机数
        int d  = (int) (Math.random() * 10);  //[0, 10]随机数

        System.out.printf("%d %d %d %d %d %d %d", a, a2, b, b2, c, c2, d);
    }
}
