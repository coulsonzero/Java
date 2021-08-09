package LeeCode;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int target=10;
        System.out.println(Arrays.toString(twoSum(new int[] {1,2,3,4,5,6}, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        /*
         for(int i=0; i<nums.length; i++){
            for(int j=; j<nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        */
        return new int[0];
    }
}

// 下标[3,5]