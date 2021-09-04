package LeetCode;

/**
 * @author coulson
 * @version 2021-06-08 13:35
 */

/**
 * 查找数组的中心索引
 * input: nums = [1, 7, 3, 6, 5, 6]
 * output: 3
 * reason: 6(下标为3)的左侧值(1 + 7 + 3) = 右侧值(5 + 6)
 */
public class Soultion4 {
    // left*2 + nums[i] == all
    public static int pivotIndex(int[] nums) {
        int all = 0;
        for( int i = 0; i < nums.length ; i++) {
            all += nums[i];
        }
        int left = 0;
        for( int i = 0; i < nums.length ; i++){
            if (left*2 + nums[i] == all) {return i;}
            else {left += nums[i];}
        }
        return -1;
    }
}