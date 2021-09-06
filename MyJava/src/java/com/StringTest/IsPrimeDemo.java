package java.com.StringTest;

import java.util.Scanner;

/**
 * @author CoulsonZero
 * @version 2021-05-30 16:48
 */
public class IsPrimeDemo {
    public static void main(String[] args) throws Exception {
        //找出不大于n的最大质数
        int n = new Scanner(System.in).nextInt();
        System.out.println(printMaxPrimeNum(n));
    }
    //从后遍历
    public static int printMaxPrimeNum(int n) {
        for (int i = n; i >= 2; i--) {
            if (IsPrimeNum(i))
                return i;
        }
        return -1;
    }
    //判断是否为质数
    public static boolean IsPrimeNum(int n) {
        int count = 0;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                count += 1;
        }
        return count == 1;
    }
}
