import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 读取文件内容，并匹配数字
 *
 * @author coulson
 * @version 2021-09-08 19:27
 */
public class ReadFileNum {
    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "E:\\MyRepository\\Java\\MyJava\\src\\Test\\ShuffleCode.java";
        System.out.println(mathchIntger(readFile(filepath)));
    }
    public static StringBuilder readFile(String filepath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filepath));
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.nextLine());
        }
        return sb;
    }
    public static StringBuilder mathchIntger(StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = Pattern.compile("\\d").matcher(sb);
        while (matcher.find()) {
            sb2.append(matcher.group());
        }
        return sb2;
    }
}
