package com.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class $JPasswordFiled {
    public static void main(String[] args) {
        //1.新建窗口
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //2.添加至面板
        JPanel panel = new JPanel();
        //...
        JPasswordField passwordField= new JPasswordField(16);
        JButton button = new JButton("登录");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(passwordField.getPassword());
            }
        });

        panel.add(button);
        panel.add(passwordField);
        jf.add(panel);

        //3.显示窗口
        jf.setVisible(true);
    }
}
