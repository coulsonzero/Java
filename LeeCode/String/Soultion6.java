package LeetCode;

/**
 * @author coulson
 * @version 2021-06-08 14:09
 * 输入：s = "  hello world  "
 * 输出："world hello"
 */
public class Soultion6 {
    public String reverseWords(String s) {
        // 去除两端空白，并匹配空格字符
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}

/**
 * python 3
 class Solution:
    def reverseWords(self, s: str) -> str:
        return ' '.join(s.split()[::-1])
 */