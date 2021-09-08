请实现一个函数，把字符串 s 中的每个空格替换成"%20"
```
输入：s = "We are happy."
输出："We%20are%20happy."
```

```java
class Solution {
    public StringSum replaceSpace(StringSum s) {
        StringSum string = s.replace(" ", "%20");
        return string;
    }
}
```
`执行用时：0 ms` , 在所有 Java 提交中击败了100.00%的用户  
`内存消耗：36.3 MB`, 在所有 Java 提交中击败了50.84%的用户  
***
```java
class Solution {
    public StringSum replaceSpace(StringSum s) {
        StringBuilder str = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') str.append("%20");
            else str.append(c);
        }
        return str.toString();
    }
}
```
`执行用时: 1 ms`  
`内存消耗: 36.3 MB`  
