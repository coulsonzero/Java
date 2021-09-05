package LeeCode.Math;
import java.math.BigInteger;
// import java.math.BigDecimal;
import java.util.*;
/**
 * Input: "1","99"
 * Output: "100"
 * Explanation：1+99=100
 */
public class BigIntegerAdd {
    public static void main(String[] args) {
        System.out.println(solve("1", "99"));
    }

    public static String solve(String s, String t) {
        // write code here
        return new BigInteger(s).add(new BigInteger(t)).toString();
        /*
        BigDecimal a = new BigDecimal(s);
        BigDecimal b = new BigDecimal(t);
        BigDecimal add = a.add(b);
        return String.valueOf(a.add(b));    //add + "";
        */
    }
}
