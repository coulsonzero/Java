package com.swing;

import javax.swing.*;
import java.awt.*;

public class ButtonTest {
    public static void main(String[] args) {
        //1.新建窗口
        JFrame jf = new JFrame("窗口测试");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(400,500);


        //2.按钮面板
        JButton blue = new JButton("蓝色按钮");
        JButton green = new JButton("绿色按钮");
        //将按钮添加至面板内并布局面板
        JPanel panel = new JPanel();
        panel.add(blue);
        panel.add(green);





        jf.add(panel);
        jf.setVisible(true);
    }
}
