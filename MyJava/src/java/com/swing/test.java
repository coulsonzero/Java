package java.com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class test {
    public static void main(String[] args) {
        //1.新建窗口
        JFrame jf = new JFrame("窗口测试");
        jf.setSize(400,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //2.新建面板
//        GridLayout layout = new GridLayout(3,2);
//        layout.setHgap(10);
//        layout.setVgap(10);
        JPanel panel = new JPanel();  //布局: new FlowLayout/BorderLayout/BorderLayout()

        //3.新建基础组件，并添加到面板
        JButton button01 = new JButton("确认");
//        JButton button02 = new JButton("确认");
//        JButton button03 = new JButton("确认");
//        JButton button04 = new JButton("确认");
//        JButton button05 = new JButton("确认");
//        JButton button06 = new JButton("确认");
//        JButton button07 = new JButton("确认");

//        button01.setLocation(50,50);
//        button01.setSize(100,50);
//        button02.setBounds(50,100,100,50);
//        button03.setBounds(panel.getWidth()-100, panel.getHeight()-50,100,50);
        button01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button01 = (JButton) e.getSource();
                System.out.println("正在点击");
            }
        });
        panel.add(button01);
//        panel.add(button02);
//        panel.add(button03);
//        panel.add(button04);
//        panel.add(button05);
//        panel.add(button06); //,BorderLayout.CENTER
//        panel.add(button07);

        JLabel label = new JLabel("文本和图片", new ImageIcon("c.jpg"),SwingConstants.CENTER);
        panel.add(label);


        //将面板设置到窗口
        jf.setContentPane(panel);
        //将内存中的窗口显示在屏幕上
        jf.setLocationRelativeTo(null);
        jf.pack();
        jf.setVisible(true);
    }
}
