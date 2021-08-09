package MyFile;

import java.io.*;

/**
 * @author coulson
 * @version 16.0.1 2021-07-21 9:57
 */
public class ReadFile2 {
    public static void main(String[] args) throws IOException {
        String s = "C:\\Users\\21059\\Desktop\\Tips\\test.txt";
        System.out.println(readToString(s));
    }


    //用readline()之类的方法，可能需要反复访问文件，而且每次readline()都会调用编码转换，降低了速度
    //在已知编码的情况下，按字节流方式先将文件都读入内存，再一次性编码转换是最快的方式
    public static String readToString(String fileName) {
        String encoding = "GBK";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }
}
