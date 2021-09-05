
接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串
```
输入描述：
输入一行，为一个只包含小写字母的字符串。
输出描述：
输出该字符串反转后的字符串。
```
输入：`BufferedReader(new InputStreamReader(System.in))`  
```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while((str=br.readLine())!=null){
    pass
}
```
***
```java
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str=br.readLine())!=null){
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        }
    }
}
```
`运行时间 6ms`
`占用内存 9092KB`


```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        System.out.println(sb.reverse());
    }
}
```
`运行时间：26ms`
`占用内存：10520KB`
***
```
输入：I am a boy
输出：boy a am I
```
```java
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str=br.readLine())!=null){
            //1.
            String[] s = str.split(" ");
            StringBuilder sb = new StringBuilder();
            //2.
            for (int i = s.length-1; i >0 ; i--) {
                sb.append(s[i]).append(" ");
            }
            sb.append(s[0]);
            System.out.println(sb);
        }
    }
}
```
`运行时间：10ms`
`占用内存：9224KB`
