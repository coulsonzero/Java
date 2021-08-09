package JavaSE.Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 11:06
 */
public class ServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8002);
        // 监听客户端连接
        Socket accept = socket.accept();

        // 获取输入流
        InputStream in = accept.getInputStream();
        /*
        byte[] bytes = new byte[124];
        int len = in.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("客户端: "+data);
         */
        byte[] bytes = new byte[124];
        System.out.println("客户端: " + new String(bytes, 0, in.read(bytes)));

        // 释放资源
        accept.close();
        socket.close();
    }
}
