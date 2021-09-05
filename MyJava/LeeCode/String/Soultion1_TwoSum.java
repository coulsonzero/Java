package LeeCode.String;

import java.util.HashMap;

/**
 * @author coulson
 * @version 2021-06-08 10:48
 * 双循环线性查找
 * 时间复杂度： O(n^2)
 * 空间复杂度： O(1)
 *
 * 哈希查找： O(1)
 */
public class Soultion1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /**
         * HashTree无法查找下标
         * HashMap 能同时存储键值,以空间换时间
         * 时间复杂度： O(1)
         * 空间复杂度： O(n)
         */
        // 建立HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // 遍历数组元素
        for(int i=0; i < nums.length; i++){
            // hash查找: 时间复杂度O(1)
            if(map.containsKey(target-nums[i])){
                // 返回下标
                return new int[]{map.get(target-nums[i]),i};
            }
            // 如果未找到目标元素则将数组该元素和下标存入HashMap中
            map.put(nums[i], i);
        }
        // 如果遍历数组后仍未找到则返回长度为0的空数组，表示不存在目标元素下标
        return new int[0];
    }
}
