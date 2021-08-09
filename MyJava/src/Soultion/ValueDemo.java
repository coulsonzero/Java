package Soultion;

import java.util.Arrays;
import java.util.Collections;

public class ValueDemo {
    public static void main(String[] args) {
        Integer[] nums = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(nums));
        int max = (int) Collections.max(Arrays.asList(nums));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
