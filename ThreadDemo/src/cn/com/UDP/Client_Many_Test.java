package cn.com.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 16:24
 * 多发
 */
public class Client_Many_Test {
    public static void main(String[] args) {
        try {
            System.out.println("启动客户端");
            //创建发送端
            DatagramSocket socket = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("客户端说:");
                String msg = sc.nextLine();
                if ("exit".equals(msg)){
                    System.out.println("退出成功");
                    socket.close();//关闭管道
                    break;//结束当前循环
                }
                //创建一个数据对象包
                byte[] b = msg.getBytes(StandardCharsets.UTF_8);
                DatagramPacket packet = new DatagramPacket(b,b.length, InetAddress.getLocalHost(),8888);
                //发送数据
                socket.send(packet);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
