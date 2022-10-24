package cn.com.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 16:24
 * 多收
 */
public class Service_Many_Test {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //创建接收端对象
        DatagramSocket socket = new DatagramSocket(8888);
        //创建接收数据包
        byte[] bytes = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        while (true){
            //接收数据
            socket.receive(packet);
            //取出数据
            int len = packet.getLength();//获取数据包的数据大小
            String rs = new String(bytes,0,len);
            System.out.println("服务端收到:" +rs);
            if ("exit".equals(rs)){
                System.out.println("服务端离线成功");
                //关掉管道
                socket.close();
                break;//关闭循环
            }

        }

    }
}
