package LeetCode;

import java.util.Arrays;

/**
 * @author coulson
 * @version 2021-06-08 12:56
 * 计算质数(质数又称素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数；否则称为合数)
 */


// 埃氏筛
/**
 * 首先排除0和1
 * 排除2、3、5、7、...的倍数
 * 剩下的为质数
 */
class Solution3 {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        // 从 2 开始枚举到 sqrt(n)。
        for (int i = 2; i * i < n; i++) {
            // 如果当前是素数
            if (isPrime[i]) {
                // 就把从 i*i 开始，i 的所有倍数都设置为 false。
                for (int j = i * i; j < n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }

        // 计数
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}


// 质朴思路
/**
 * 从2->n内的数中判断是否为质数(2<i<n ; n%i == 0)
 */
public class Soultion3 {
    // 统计质数的个数
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // 判断质数
    private boolean isPrime(int num) {
        int max = (int)Math.sqrt(num);
        // 或者 "i*i <= num"
        for (int i = 2; i <= max; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}



