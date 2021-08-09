package NiuKe;

import java.util.*;

/**
 * @author CoulsonZero
 * @version 2021-05-28 13:49
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 0, 2, 5, 3 };

        System.out.println(findRepeatNumber(nums));
        System.out.println(findRepeatNumber2(nums));
    }
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length;i++){
            int m = nums[i];
            if (nums[i] == nums[i-1])
                return nums[i];
        }
        return -1;
    }
    public static List<Integer> findRepeatNumber2(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            if (!set.add(num)) {
                arrayList.add(num);
            }
        }
        return arrayList;
//        System.out.println(arrayList);
    }
}
