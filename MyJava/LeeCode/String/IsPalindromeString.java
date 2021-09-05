package LeeCode.String;

/**
 * NC 141  判断回文字符串
 * Input: "randnar"
 * Output: true
 */
public class IsPalindromeString {
    /**
     * 双指针
     */
    public boolean judge (String str) {
        // write code here
        for(int i=0, j=str.length()-1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
}

/*
for (int i = 0; i < str.length(); i++) {
    return str.charAt(i) == str.charAt(str.length() - i - 1);
}
return false;
 */

/*
int i=0, j=str.length()-1;
while (i < j) {
    if (str.charAt(i++) != str.charAt(j--)) return false;
}
return true;
 */



/**
 * 反转后判断是否相等
public boolean judge(String str) {
    String rev = new StringBuffer(str).reverse().toString();
    return str.equals(rev);
}
 */

