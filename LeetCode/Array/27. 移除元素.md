## 移除元素
给你一个数组 nums 和一个值 val，你需要`原地移除`所有数值等于val的元素，并`返回移除后数组的新长度`。
不要使用额外的数组空间，你必须仅使用 `O(1) 额外空间`并 `原地修改`输入数组。
```
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3]
```

思路分析： 
i为遍历指针，j为输出指针
如果`num[i] != val`，双指针交换`nums[j++] = nums[i]`)

* * *
### java双指针
```java
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
```

```
执行用时：0 ms, 在所有 Java 提交中击败了100.00%
内存消耗：36.9 MB, 在所有 Java 提交中击败了70.04%的用户
```
