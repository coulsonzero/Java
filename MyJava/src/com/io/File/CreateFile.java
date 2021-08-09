package com.io.File;

import java.util.Formatter;

/**
 * 新建文件
 * @author CoulsonZero
 * @version 2021-05-17 13:06
 */
public class CreateFile {
    public static void main(String[] args) {
        String pathname = "C:\\Users\\21059\\Desktop\\Tips\\z.txt";
        try {
            //创建新文件(如果存在则覆盖)
            Formatter fp = new Formatter(pathname);
            //写入文件
            fp.format("%s %s %s", "1","John","Smith \r\n");
            fp.format("%s %s %s", "2","Amy","Brown");
            fp.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
