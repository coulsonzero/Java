package java.JavaSE.Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author coulson
 * @version 2021-08-08 10:05
 *
 * UDP接收端
 * new DatagramSocket(post)
 * byte[] bytes = new byte[1024]
 * new DatagramPacket(bytes, bytes.length)
 * socket.receive(dp)
 * System.out.println("数据是: " + new String(dp.getData(), 0, dp.getLength()))
 * socket.close()
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 创建接收端的Socket对象
        DatagramSocket socket = new DatagramSocket(8000);

        // 创建数据包, 用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 接收数据
        socket.receive(dp);

        // 解析数据包, 并把数据放到控制台显示
        /**
         * byte[] datas = dp.getData(); // 数据缓冲区
         * int len = dp.getLength();   // 实际数据长度
         * String s = new String(datas, 0, len);
         * System.out.println("数据是: " + s);
         */
        System.out.println("数据是: " + new String(dp.getData(), 0, dp.getLength()));

        // 关闭接收端
        socket.close();


    }
}
