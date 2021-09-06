package java.com.MyFile;

import java.io.File;

/**
 * @author coulson
 * @version 2021-07-20 11:15
 */
public class DeleteFile {
    public static void main(String[] args) {
        try {
            // 删除文件
            File f = new File("C:\\Users\\21059\\Desktop\\Tips\\create1.txt");
            f.delete();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
