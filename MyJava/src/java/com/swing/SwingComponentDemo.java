package java.com.swing;
import javax.swing.*;
import java.awt.*;

public class SwingComponentDemo extends JFrame {
    public static void main(String[] args) {
        //新建窗口
        JFrame jf = new JFrame("窗口测试");
        //组件容器
        Container container = jf.getContentPane();
        //窗口居中(实际并未真正实现居中)--> 如何调整窗口位置？
        jf.setLocationRelativeTo(null);
        //窗口大小
        jf.setSize(400,500);
        //设置窗口关闭按钮点击后的默认操作
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * (WindowConstants）=>（JFrame)
         * 参考值：
         * EXIT_ON_CLOSE  //结束进程
         * HIDE_ON_CLOSE  //隐藏窗口(不会结束进程)，再次调用setVisible(true)将再次显示
         * DISPOSE_ON_CLOSE //销毁，如果所有窗口都销毁则自动结束进程
         * DO_NOTHING_ON_CLOSE  //不执行任何操作, 点击关闭无效
         */
//        JPanel buttonPaner = new JPanel();
//
        JCheckBox bold = new JCheckBox("Bolmftg");
        bold.setSelected(true);
//        buttonPaner.add(bold);
        container.add(bold);

        System.out.println();

        //显示窗口
        jf.setVisible(true);
    }

}


