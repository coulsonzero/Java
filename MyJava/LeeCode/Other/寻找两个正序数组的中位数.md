'''
题目要求：给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000

Input: nums1 = [], nums2 = [1]
Output: 1.00000

Input: nums1 = [2], nums2 = []
Output: 2.00000
'''



class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums = sorted(nums1 + nums2)
        lenge = len(nums)//2

        #当新数组只有一个元素时，直接取该值
        if len(nums) == 1:
            return nums[0]
        #如果新数组长度是奇数，取中间数
        if len(nums)%2 != 0: 
            return nums[lenge]
        #如果新数组长度是偶数，取中间两数值的平均数
        else:
            return (nums[lenge-1]+nums[lenge])/2
