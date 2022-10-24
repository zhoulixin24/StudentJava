package cn.com.Socket_TCP_ThreadPool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 19:31
 */
public class ServerReaderRunnable implements Runnable{
    public Socket socket;
    public ServerReaderRunnable (Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
//3.从Socket管道中得到一个字节输入流
        InputStream is = null;
        try {
            is = socket.getInputStream();
            //4.字节流转字符流,再将字符串包装到缓冲字符输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            //5.按照行读取消息
            String msg;
            while ((msg = bufferedReader.readLine())!=null){
                System.out.println("客户端说："+ msg);
            }
        } catch (IOException e) {
            System.out.println(socket.getLocalSocketAddress()+"下线了");
        }

    }
}
