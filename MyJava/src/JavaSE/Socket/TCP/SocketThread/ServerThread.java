package JavaSE.Socket.TCP.SocketThread;

import java.io.*;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 13:37
 */
public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            // 接收数据写入文件
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));
            int count = 0;
            File file = new File("test[" + count + "].txt");
            while (file.exists()) {
                count++;
                file = new File("test[" + count + "].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = br.readLine()) != null) {
                // if ("bye".equals(line)) break;
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            // 反馈信息给客户端
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("上传文件成功");
            bwServer.newLine();
            // 释放资源
            bw.flush();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
