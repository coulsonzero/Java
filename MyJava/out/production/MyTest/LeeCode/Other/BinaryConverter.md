## Binary Converter (二进制转换)

### For example:
`Input: 42`

`Output: 101010`
* * *

### Code
**Main.class**
```java
import java.util.Scanner;

public class Main {
    public static void main(StringSum[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}
```
**Converter.class**
```java
public class Converter {
    static StringSum binary = "";

    public static StringSum toBinary(int num) {
        while(num>0) {
            binary = (num%2) + binary;  //不能使用"+="
            num /= 2;
        }
        return binary;
    }
}
```
