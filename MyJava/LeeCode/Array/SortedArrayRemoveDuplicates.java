package LeeCode.Array;

/**
 * 原地删除排序数组中的重复项，返回新长度
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5
 * nums = [0,1,2,3,4]
 */


// 快慢指针
class SortedArrayRemoveDuplicates {
    /**
     * 快慢指针
     *
     * 如果右指针指向的值等于左指针指向的值，左指针不动。
     * 如果右指针指向的值不等于左指针指向的值，那么左指针往右移一步，然后再把右指针指向的值赋给左指针。
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            //值不同时，左指针右移一位，再将右指针值赋值给左指针
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
        }
        //返回左指针的索引+1，即新数组的长度
        return ++slow;
    }
}
