package JavaSE.Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 11:14
 *
 * 反馈
 */
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8003);
        // 监听客户端连接
        Socket accept = socket.accept();

        // 获取输入流
        InputStream in = accept.getInputStream();
        byte[] bytes = new byte[124];
        int len = in.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("服务器: "+data);

        // 获取输出流, 写入数据
        OutputStream out = accept.getOutputStream();
        out.write("数据已经收到".getBytes());

        // 释放资源
        accept.close(); //可注释
        socket.close();
    }
}
