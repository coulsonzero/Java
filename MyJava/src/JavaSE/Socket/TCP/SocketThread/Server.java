package JavaSE.Socket.TCP.SocketThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author coulson
 * @version 2021-08-08 13:35
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10000);

        while (true) {
            Socket accept = socket.accept();
            new Thread(new ServerThread(accept)).start();
        }
    }
}
