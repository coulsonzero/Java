package Soultion;

import java.util.Arrays;

/**
 * @author CoulsonZero
 * @version 2021-05-31 21:24
 */
public class findRepeatNum {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 3, 5, 5, 3, 6 ,2, 6};
        System.out.println(findRepeatNums(nums));
    }
    public static int findRepeatNums (int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
