package JavaSE.Operator;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 13:27
 */
public class Operators {
    //java运算符
    public static void main(String[] args) {
        System.out.println(5.0/2);  //2.5
        System.out.println(5/2);    //2


        int i = 0;
        System.out.println(i++);    //0  后缀：先输出i，再运算
        System.out.println(i);      //1
        System.out.println(++i);    //2  前缀：先运算，再输出值图  i=i+1 => ++i
        System.out.println(i);      //2
    }
}
