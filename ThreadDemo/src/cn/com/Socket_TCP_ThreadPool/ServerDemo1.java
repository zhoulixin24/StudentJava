package cn.com.Socket_TCP_ThreadPool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/26 17:07
 * Socket网络编程 服务端
 */
public class ServerDemo1 {
    public static ExecutorService pool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),
            Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        try {
            //创建Socket管道
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true){
                //2.必须调用accept方法，等待接收客户端的Socket连接请求，建立Socket通信管道
                Socket socket = serverSocket.accept();
                System.out.println(socket.getLocalSocketAddress()+"上线了");
                //任务对象负责读取消息
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
