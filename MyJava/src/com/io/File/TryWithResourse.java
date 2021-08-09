package com.io.File;

/**
 * 读取文件后自动关闭文件
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TryWithResourse {
    public static void main(String[] args) {
        long start= System.currentTimeMillis();
        String filepath = "C:\\Users\\21059\\Desktop\\Tips\\y.txt";
        try(Scanner sc = new Scanner(new FileInputStream(filepath), StandardCharsets.UTF_8)) {
            while (sc.hasNext())
                System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("执行时间%d ms\n", end-start);
    }
}
