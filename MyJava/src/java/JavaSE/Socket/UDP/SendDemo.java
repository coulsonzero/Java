package java.JavaSE.Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author coulson
 * @version 2021-08-08 9:50
 *
 * UDP发送端
 * new DatagramSocket()
 * byte[] bytes = new byte[1024]
 * new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), post)
 * socket.send(dp)
 * socket.close()
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建UDP发送端的Socket对象(套接字)
        DatagramSocket socket = new DatagramSocket();

        // 数据包
        /**
         * 端口号: [0, 65535], [0,1023]用于知名网站, 普通应用程序[1024, 65525],
         * 如果被占用会导致当前程序启动失败
         * 发送端与接收端端口号需一致
         */

        /**
         * byte[] bytes = "hello, coulson".getBytes();
         * int len = bytes.length;
         * InetAddress address = InetAddress.getByName("192.168.1.6");
         * int port = 1025;
         * DatagramPacket dp = new DatagramPacket(bytes, len, address, port);
         */

        byte[] bytes = "hello, coulson".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 8000);

        // 发送数据包
        socket.send(dp);
        // 关闭发送端
        socket.close();
    }
}
