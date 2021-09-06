package java.com.swing;

import javax.swing.*;
import java.awt.*;

public class $JRadioButton {
    public static void main(String[] args) {
        //新建窗口
        JFrame jf = new JFrame("测试窗口");
        jf.setSize(300, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //新建单选按钮
        JRadioButton radioButton01 = new JRadioButton("男", true);
        JRadioButton radioButton02 = new JRadioButton("女");


        //组装单选按钮
        radioButton01.setFocusPainted(false);
//        radioButton01.setContentAreaFilled(false);
        radioButton02.setFocusPainted(false);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton01);
        buttonGroup.add(radioButton02);
        //添加至面板
        JPanel panel = new JPanel();
        panel.add(radioButton01);
        panel.add(radioButton02);
        jf.add(panel);


        //显示窗口
        jf.setVisible(true);

    }
}
