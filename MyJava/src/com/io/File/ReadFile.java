package com.io.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 读取文件内容
 * @author CoulsonZero
 * @version 2021-05-17 12:49
 */
public class ReadFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\21059\\Desktop\\Tips\\x.txt"));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
