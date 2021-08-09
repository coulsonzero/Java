package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author CoulsonZero
 * @version 2021-05-26 18:27
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matcher m = Pattern.compile("\\w+").matcher(sc.nextLine());
//        System.out.println(m.matches());
        while(m.find()) {
                for(int i = 0; i < m.groupCount(); i++)
                    System.out.println("[" + m.group(i) + "]");
    //            System.out.println();

        }
    }
}
