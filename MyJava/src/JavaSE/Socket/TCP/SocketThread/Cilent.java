package JavaSE.Socket.TCP.SocketThread;

import java.io.*;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 13:34
 */
public class Cilent {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        // 1. 录入键盘输入信息
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //new FileReader("test1.txt")

        // 2. 上传文件到服务器
//        BufferedReader br = new BufferedReader(new FileReader("test.txt"));


        // 封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            // if ("bye".equals(line)) break; // 自定义标记不太好, 如果输入的数据为"bye", 则发送数据结束
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


        // 接收服务器反馈
        socket.shutdownOutput();  //结束标记, 避免文本未完全录入
        BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈信息: " + data);


        // 释放资源
        br.close();
        socket.close();
    }
}
