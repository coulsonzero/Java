/**
输入：strs = ["flower","flow","flight"]
输出："fl"

输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀
*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String str = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(str) != 0){
                str=str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}

/**
执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗：36.3 MB, 在所有 Java 提交中击败了88.01%的用户
*/
