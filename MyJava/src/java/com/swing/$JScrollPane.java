package java.com.swing;

import javax.swing.*;

public class $JScrollPane {
    //1.新建窗口
    public static void main(String[] args) {

    JFrame jf = new JFrame("测试窗口");
        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    //2.添加至面板
    JPanel panel = new JPanel();
    //...

    //panel.add(...);
        jf.add(panel);

    //3.显示窗口
        jf.setVisible(true);
    }
}
