package LeeCode.Array;

/**
 * 反转字符数组
 *
 * input: ["h","e","l","l","o"]
 * output: ["o","l","l","e","h"]
 */

public class ReverseCharArray {
    //双指针法(首尾交换)
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
