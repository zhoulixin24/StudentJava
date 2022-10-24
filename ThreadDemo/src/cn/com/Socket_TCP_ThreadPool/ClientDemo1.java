package cn.com.Socket_TCP_ThreadPool;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 16:55
 * Socket网络编程 实现是客户端同时处理多个客户端的消息-通过线程池
 */
public class ClientDemo1 {

    public static void main(String[] args) {
        try
        {
            //1、创建Socket通信管道请求有服务端的连接
            //public Socket(String host,int port);
            //参数一：服务端的IP地址
            //参数二：服务端的端口
            Socket socket = new Socket("127.0.0.1",6666);
            //2.从Socket管道得到一个字节输出流，负责发送数据
            OutputStream outputStream = socket.getOutputStream();
            //3.将低级流包装成高级流
            PrintStream ps = new PrintStream(outputStream);
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("请说:");
                String msg = sc.nextLine();
                //4.发送消息
                ps.println(msg);
                //刷新流
                ps.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
