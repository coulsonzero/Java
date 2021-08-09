package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author CoulsonZero
 * @version 2021-05-26 20:44
 * 正则表达式：字符串高级匹配法
 */
public class StringMatchDemo {
    public static void main(String[] args) {
        String str = "ab&&2";
        Pattern p = Pattern.compile("[^&]");
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.print(m.group());
        }

    }
}