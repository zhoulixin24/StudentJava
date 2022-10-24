package cn.com.Socket_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 17:07
 * Socket网络编程 服务端
 */
public class ServerDemo1 {
    public static void main(String[] args) {
        try {
            //创建Socket管道
            ServerSocket serverSocket = new ServerSocket(7777);
            //2.必须调用accept方法，等待接收客户端的Socket连接请求，建立Socket通信管道
            Socket socket = serverSocket.accept();
            //3.从Socket管道中得到一个字节输入流
            InputStream is = socket.getInputStream();
            //4.字节流转字符流,再将字符串包装到缓冲字符输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            //5.按照行读取消息
            String msg;
            if ((msg = bufferedReader.readLine())!=null){
                System.out.println("客户端说："+ msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
