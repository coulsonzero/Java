'''
字符串反转方法：
S[::-1]  最快
''.join(S.reverse())
''.join(reversed(S))
'''

class Solution:
    def reverse(self, x: int) -> int:
        s = int(str(x)[::-1]) if x>=0 else -int(str(x)[1:][::-1])
        return s if -2**31 <= s <= 2**31-1 else 0
    
        '''
        abs效率太低，执行时间提高
        s = int(str(abs(x))[::-1])
        if -2**31 <= s <= 2**31-1: 
            return s if x >= 0 else -s
        return 0
        '''


'''
给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

输入：x = 123
输出：321

输入：x = -123
输出：-321

输入：x = 120
输出：21

输入：x = 0
输出：0
-231 <= x <= 231 - 1  
        
执行用时：40 ms, 在所有 Python3 提交中击败了77.46%的用户
内存消耗：14.6 MB, 在所有 Python3 提交中击败了93.45%的用户
'''

        
        
