package RegularExpression;

import java.util.Scanner;

/**
 * @author CoulsonZero
 * @version 2021-05-27 12:20
 */
public class IsPrimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n; i>2; i--) {
            if (Isprime(n)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean Isprime(int n) {
        if (n<2) return false;
        for (int i=2; i*i <= n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}

