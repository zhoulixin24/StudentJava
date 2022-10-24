package cn.com.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 16:06
 */
public class ServiceDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //创建接收端对象
        DatagramSocket socket = new DatagramSocket(8888);
        //创建接收数据包
        byte[] bytes = new byte[64];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        //接收数据
        socket.receive(packet);
        //取出数据
        int len = packet.getLength();//获取数据包的数据大小
        String rs = new String(bytes,0,len);
        System.out.println("收到:" +rs);
        //关掉管道
        socket.close();
    }
}
