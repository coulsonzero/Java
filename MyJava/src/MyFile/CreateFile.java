package MyFile;

import java.util.Formatter;

/**
 * @author coulson
 * @version 2021-07-20 10:55
 */
public class CreateFile {
    // 新建文件
    public static void main(String[] args) {
        // Ctrl + Alt + T: 快速生成try-catch块
        try {
            // 只能是文件格式，不能创建文件夹
            Formatter f = new Formatter("C:\\Users\\21059\\Desktop\\Tips\\create1.txt");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
