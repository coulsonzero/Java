package JavaSE.Socket.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 11:25
 *
 * 将客户端的信息写入到文件中
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8000);
        // 监听客户端连接
        Socket accept = socket.accept();

        // 接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        // 将数据写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            // if ("bye".equals(line)) break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        // 反馈信息给客户端
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bwServer.write("上传文件成功");
        bwServer.newLine();
        bw.flush();



        // 释放资源
        bw.close();
        socket.close();
    }
}
