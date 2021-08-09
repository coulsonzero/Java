package MyFile;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author coulson
 * @version 2021-07-20 11:10
 */
public class FileDemo2 {
    public static void main(String[] args) {
        // Ctrl + Alt + T: 快速生成try-catch块
        try {
            // 1. 新建文件(if文件已存在则覆盖)
            Formatter f = new Formatter("C:\\Users\\21059\\Desktop\\Tips\\Create.txt");
            // 2. 写入文件
            f.format("%s %s %s", "1", "john", "Smith\r\n");
            f.format("%s %s %s", "2", "Amn", "Brown\r\n");
            // 关闭文件
            f.close();

            // 3. 读取文件内容
            Scanner sc = new Scanner(new File("C:\\Users\\21059\\Desktop\\Tips\\Create.txt"));
            while(sc.hasNext()) { System.out.println(sc.nextLine()); }
            sc.close();

        } catch (Exception e) { System.out.println("Error"); }



    }
}
