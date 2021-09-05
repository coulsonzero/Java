package Soultion;

/**
 * @author CoulsonZero
 * @version 2021-05-28 19:08
 */
public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = { "ab", "2", "cf" };
        long start = System.currentTimeMillis();
        System.out.println(printString(arr));
        System.out.printf("执行时间：%d ms",System.currentTimeMillis()-start);
    }

    /**
     * ["ab", "2", "cf]
     * "ab&&2&&cf"
     *
     */
    public static String printString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        int i;
        for ( i = 0; i < arr.length; i++)
            if (i<arr.length-1) {sb.append(arr[i]).append("&&");}
            else {sb.append(arr[i]);}
        return sb.toString();
    }
}
