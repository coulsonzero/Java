/**
Question:
编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题

Example:
输入：["h","e","l","l","o"]
输出：["o","l","l","e","h"]

输入：["H","a","n","n","a","h"]
输出：["h","a","n","n","a","H"]
*/




// 双指针,原地反转
class Solution {
    public void reverseString(char[] s) {
        char temp = 0;
        for (int i = 0,j = s.length - 1; i < s.length/2 && j >= s.length/2; i++,j--) {
            if(s[i] != s[j] ){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;

            }
        }
    }
}

/**
* 原地反转(更省内存空间)
class Solution {
  public void reverseString(char[] s) {
    for(int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = temp;
    }
  }
}
*/
