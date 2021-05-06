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
