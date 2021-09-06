package java.JavaSE.Socket.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 11:02
 */
public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.6", 8002);

        // 获取输出流, 写入数据
        OutputStream out = socket.getOutputStream();
        out.write("hello coulson".getBytes());

        socket.close();

    }
}
