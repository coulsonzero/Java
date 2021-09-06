package java.com.MyFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author coulson
 * @version 16.0.1 2021-07-21 10:12
 */
public class ReadFile3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\21059\\Desktop\\Tips\\test.txt";
         readFileInfo(path);
    }

    public static void readFileInfo(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while((line = br.readLine()) != null)
                System.out.println(line);
        }
    }
}
