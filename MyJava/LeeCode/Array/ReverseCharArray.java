package MyJava.LeeCode.Array;

/**
 * 反转字符串
 * input: ["h","e","l","l","o"]
 * output: ["o","l","l","e","h"]
 */

class ReverseCharArray {
    public void reverseString(char[] s) {
        /**
         *  双指针法(首尾交换)
         */
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
