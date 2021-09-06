package java.JavaSE.Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 11:13
 *
 * 反馈
 */
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.6", 8003);

        // 获取输出流, 写入数据
        OutputStream out = socket.getOutputStream();
        out.write("hello coulson".getBytes());

        // 接收服务器反馈
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[124];
        int len = in.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("数据是: "+data);

        socket.close();

    }
}
