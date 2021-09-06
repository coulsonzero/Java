package java.JavaSE.Collection;

import java.util.Random;

/**
 * @author coulson
 * @version 2021-08-05 7:32
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10);
        double b = r.nextDouble()*10;
        System.out.println("a: "+a);
        System.out.printf("b: %.2f",b);


    }
}
