package com.io.File;

import java.awt.*;
import java.io.File;
import java.net.URI;
import java.io.IOException;

public class DesktopDemo {
    public static void main(String[] args) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(URI.create("https://cn.bing.com/dict?FORM=Z9LH3"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                desktop.open(new File("C:\\Users\\21059\\Desktop\\python小屋账号.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("当前平台不支持 Desktop");
        }
    }
}
