package java.JavaSE.Interface.AddLambda;

/**
 * @author coulson
 * @version 2021-08-08 17:02
 */
public class IntDemo {
    public static void main(String[] args) {
        System.out.println(useAdd(Int::add));

    }

    private static int useAdd(Add a) {
        return a.add(5, 7);
    }
}
