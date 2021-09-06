package java.com.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class $JButton {
    public static void main(String[] args) {
        //1.新建窗口
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button01 = new JButton("确认");
        button01.setFocusPainted(false);
        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button01 = (JButton) e.getSource();
                System.out.println("正在播放");
            }
        });

        //2.添加至面板
        JPanel panel = new JPanel();
        //...
        panel.add(button01);
        jf.add(panel);

        //3.显示窗口
        jf.setVisible(true);
    }
}
