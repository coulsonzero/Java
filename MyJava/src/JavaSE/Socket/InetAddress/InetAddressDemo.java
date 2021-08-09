package JavaSE.Socket.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * @author coulson
 * @version 2021-08-08 9:38
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.1.6");     //"coulson"
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println("主机名：" + name);
        System.out.println("ip地址：" + ip);


    }
}
