## Binary Converter (二进制转换)

### For example:
`Input: 42`

`Output: 101010`
* * *
### Code
**Main.java**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}
```
**Converter.java**
```java
public class Converter {
    static String binary = "";

    public static String toBinary(int num) {
        while(num>0) {
            binary = (num%2) + binary;  //不能使用"+="
            num /= 2;
        }
        return binary;
    }
}
```
