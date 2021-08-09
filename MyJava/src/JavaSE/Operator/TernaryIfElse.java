package JavaSE.Operator;

import java.util.Random;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 14:17
 */
public class TernaryIfElse {
    public static void main(String[] args) {
        //new Random() 生成随机数
        Random r = new Random();
        int i = r.nextInt(20);
        System.out.println(i);
        //三元运算符
        int j = (i < 10) ? (i<5)? 2:3 : 200;
        System.out.println(j);

        //Math.random() 生成随机数
        int num = (int) (Math.random() * 100);
        System.out.println(num);
    }
}
