package cn.com.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 16:05
 * 发送端
 */
public class ClientDemo {
    public static void main(String[] args) {
        try {
            System.out.println("启动客户端");
            //创建发送端
            DatagramSocket socket = new DatagramSocket();
            //创建一个数据对象包
            byte[] b = "hello world".getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(b,b.length, InetAddress.getLocalHost(),8888);
            //发送数据
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
