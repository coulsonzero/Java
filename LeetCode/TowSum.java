// HashMap

public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}



/**
* python 3 优化方案
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            if nums.index(target-nums[i]) != i  and (target-nums[i]) in nums :
                    return [i, nums.index(target-nums[i])]



//java双循环
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
	        for(int j=i+1; j<nums.length; j++){   
		        if (nums[i] + nums[j] == target){
			    return new int[]{i,j};
                }
            }
		}
        return new int[0];    
	}
}


* python 3
//双循环
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]
*/		    
