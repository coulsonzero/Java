package JavaSE.Operator;

import java.math.BigInteger;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 14:30
 */
public class CharInt {
    public static void main(String[] args) {
        char c = 'g';
        System.out.println((int)c); //103

        System.out.println((char)97);  //a
        System.out.println((char)100); //d


        for(int i = 97; i < 123; i++) {
            System.out.println((char)i + ": " + i);
        }
        /*
        a: 97
        b: 98
        c: 99
        ...
        z: 122
        */

        //十进制 -> 二进制
        String res = Integer.toBinaryString(100);
        System.out.println(res);  //1100100
        BigInteger bi = new BigInteger(res,2);	//转换为BigInteger类型
        System.out.println(bi); //100
        System.out.println(Integer.parseInt(bi.toString()));    //100



        double h = 12.6;
        System.out.println(Math.round(h));  //13    四舍五入
        System.out.println(Math.ceil(h));   //13.0  向上取整
        System.out.println(Math.floor(h));  //12.0  向下取整

    }
}
