package java.com.MyFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author CoulsonZero
 * @version 2021-06-01 12:32
 */
public class ReadFile {
    // 读取文件内容
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("C:\\Users\\21059\\Desktop\\Tips\\test.txt"))) {
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
