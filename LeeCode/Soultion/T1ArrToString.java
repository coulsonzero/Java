package Soultion;

/**
 * @author CoulsonZero
 * @version 2021-05-31 20:26
 */
public class T1ArrToString {
    public static void main(String[] args) {
        //["ab","2"] => "ab&&2"
        String[] arr = {"ab", "2"};
        System.out.println(String.join("&&",arr));

    }
}
