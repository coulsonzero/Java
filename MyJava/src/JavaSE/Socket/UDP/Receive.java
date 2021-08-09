package JavaSE.Socket.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author coulson
 * @version 2021-08-08 10:43
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8001);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            socket.receive(dp);
            System.out.println("数据是: " + new String(dp.getData(), 0, dp.getLength()));
            // socket.close();
        }
    }
}
