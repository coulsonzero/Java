package com.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class $JCheckBox {
    public static void main(String[] args) {
        //1.新建窗口
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JCheckBox checkBox01 = new JCheckBox("apple");
        JCheckBox checkBox02 = new JCheckBox("banana");
        JCheckBox checkBox03 = new JCheckBox("orange");
        checkBox01.setFocusPainted(false);
        checkBox01.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JCheckBox checkBox = (JCheckBox) e.getSource();
                System.out.println(checkBox.getText()+" 是否选中: "+checkBox.isSelected());
            }
        });

        //2.添加至面板
        JPanel panel = new JPanel();
        //...
        panel.add(checkBox01);
        panel.add(checkBox02);
        panel.add(checkBox03);

        jf.add(panel);

        //3.显示窗口
        jf.setVisible(true);
    }
}
