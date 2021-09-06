package java.JavaSE;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.nowcoder.com/tutorial/10001/520cc67e48a846518a40cad2f99ba83a");
        System.out.println("URL 是 " + url.toString());
        System.out.println("协议是 " + url.getProtocol());
        System.out.println("文件名是 " + url.getFile());
        System.out.println("主机是 " + url.getHost());
        System.out.println("路径是 " + url.getPath());
        System.out.println("端口号是 " + url.getPort());
        System.out.println("默认端口号是:" + url.getDefaultPort());
    }
}
