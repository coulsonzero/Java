package java.JavaSE.Socket.UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author coulson
 * @version 2021-08-08 10:36
 */
public class Send {
    public static void main(String[] args) throws IOException {
        // 创建是Socket套接字
        DatagramSocket socket = new DatagramSocket();

        // 录入键盘输入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            // 如果输入的数据为"bye", 则发送数据结束
            if ("bye".equals(line)) {
                break;
            }
            // 创建数据,并将数据打包
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 8001);
            // 发送数据
            socket.send(dp);
        }
        // 关闭发送端
        socket.close();
    }
}
