package LeeCode.Array;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {     //map.get(...) != null
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        long start= System.currentTimeMillis();

        System.out.println(Arrays.toString(twoSum(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }, 10)));

        long end = System.currentTimeMillis();
        System.out.printf("执行时间: %d ms\n", end-start);
    }
}

