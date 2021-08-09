package StringTest;

/**
 * @author CoulsonZero
 * @version 2021-05-28 15:08
 */
public class ArrayToString {
    public static void main(String[] args) {
        //["ab", "2"] => "ab&&2"
        String[] arr = {"ab", "2", "c"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length-1; i++) {
            sb.append(arr[i]).append("&&");
        }
        System.out.println(sb.append(arr[arr.length-1]));


        String result = arr[0];
        for (int i = 1; i < arr.length; i++)
            result = result + "&&" + arr[i];
        System.out.println(result);

        String str2 = String.join("&&", arr);
        System.out.println(str2);
    }
}
