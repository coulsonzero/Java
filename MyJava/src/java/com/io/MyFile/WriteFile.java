package java.com.io.MyFile;

import java.util.Formatter;

/**
 * @author coulson
 * @version 2021-07-20 11:00
 */
public class WriteFile {
    public static void main(String[] args) {
        try {
            // 新建文件
            Formatter f = new Formatter("C:\\Users\\21059\\Desktop\\Tips\\Create.txt");
            // 写入文件
            f.format("%s %s %s", "1", "john", "Smith\r\n");
            f.format("%s %s %s", "2", "Amn", "Brown\r\n");
            // 关闭文件
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
