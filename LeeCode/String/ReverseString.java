package LeetCode.String;

/**
 * @author coulson
 * @version 2021-06-29 9:53
 */
class ReverseString {
    /*
    * 反转字符串
    * input: ["h","e","l","l","o"]
    * output: ["o","l","l","e","h"]
    */
    public void reverseString(char[] s) {
        // 双指针法
        for(int i=0, j=s.length-1; i<j; i++, j--) {
            // 交换值
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
