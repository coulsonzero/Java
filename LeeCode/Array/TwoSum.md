# 两数之和

### HashMap
```java
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){    //map.get(...) != null
                return new int[]{map.get(target-nums[i]),i};
        }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
```


### 双循环暴力解法: O(n^2)
```java
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){   
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
    }
}

```
```java
// 两数之和，返回下标
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {
        int target=10;
        System.out.println(Arrays.toString(twoSum(new int[] {1,2,3,4,5,6}, target))); 
    }
}
```
