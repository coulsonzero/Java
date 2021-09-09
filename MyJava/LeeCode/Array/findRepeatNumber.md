# 剑指 Offer 03. 数组中重复的数字
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：
```
Input: [2, 3, 1, 0, 2, 5, 3]
Output: 2 或 3
```
### 原地排序
```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
```
`执行用时: 0 ms`  
`内存消耗: 46.2 MB`  

***
### 先排序，再比较前后两项
```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) return nums[i];
        }
        return -1;
    }
}
```
`执行用时：3 ms` ,  在所有 Java 提交中击败了58.69%的用户   
`内存消耗：46.1 MB` , 在所有 Java 提交中击败了78.41%的用户 
***

```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num : nums) {
            if(dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;
    }
}
```
`执行用时: 10 ms`  
`内存消耗: 47.5 MB`  
