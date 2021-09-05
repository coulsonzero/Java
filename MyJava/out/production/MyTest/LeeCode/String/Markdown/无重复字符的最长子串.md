'''
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: s = "bbbbb"
Output: 1

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Input: s = ""
Output: 0
'''


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        k, res, Dict = -1, 0, {}
        for i, v in enumerate(s):
            if v in Dict and Dict[v] > k:  # 字符c在字典中 且 上次出现的下标大于当前长度的起始下标
                k = Dict[v]
                Dict[v] = i
            else:
                Dict[v] = i
                res = max(res, i-k)
        return res

'''
i,res,Dict = 0,0,{}
for j in range(len(s)):
            if s[j] in Dict:
                i = max(Dict[s[j]], i)
            res = max(res, j - i + 1)
            Dict[s[j]] = j + 1
        return res;
'''
