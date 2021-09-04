package LeetCode;

/**
 * @author coulson
 * @version 2021-06-08 13:48
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 * input: nums = [1,3,5,6], target = 2
 * output: 1
 */
public class Soultion5 {
    public int searchInsert(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}