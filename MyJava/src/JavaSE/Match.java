package JavaSE;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 18:27
 */
public class Match {
    static String threatData =
            "58.27.82.161@02/10/2021\n" +
            "204.45.124.171@02/11/2021\n" +
            "58.123.14.51@02/12/2021\n" +
            "58.27.124.161@02/12/2021\n";

    public static void main(String[] args) {
        Scanner sc = new Scanner(threatData);
        String pattern = "(\\d+[.]+\\d+[.]+\\d+[.]+\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";
        while (sc.hasNext(pattern)) {
            sc.next(pattern);
            MatchResult m = sc.match();
            String ip = m.group(1);
            String date = m.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
    }
}


