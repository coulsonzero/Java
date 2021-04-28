// 两数之和，返回下标
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        int target=10;
        System.out.println(Arrays.toString(twoSum(new int[] {1,2,3,4,5,6}, target))); 
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        /* for(int i=0; i<nums.length; i++){
            for(int j=; j<nums.length; j++){   
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        } */
        return new int[0];
    }
}

// 下标[3,5]
