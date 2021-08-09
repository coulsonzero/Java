import java.util.Arrays;

/**
 * @author coulson
 * @version 2021-06-30 14:47
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println((int)Math.round(new Scanner(System.in).nextDouble()));
        String str = "coulson&&22";
        System.out.println(Arrays.toString(str.split("&&")));
    }
}
