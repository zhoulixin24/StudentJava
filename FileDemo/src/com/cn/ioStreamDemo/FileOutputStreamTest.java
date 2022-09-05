package com.cn.ioStreamDemo;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author 阿甩甩
 * Create by 2022/9/5 21:34
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {

        try {
            //1.创建一个文件字节输出流管道与目标文件接通
            //OutputStream os = new FileOutputStream("FileDemo/src/com/cn/outData.txt");//每次都会清空上一次写入的数据
            OutputStream os = new FileOutputStream("FileDemo/src/com/cn/outData.txt",true);//追加就不会清空上一次写入的数据

            //2.写数据出去 public void write(int a) 写一个字节
            os.write('a');
            os.write('b');
            os.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行
            // os.write('周');

            // public void write(byte[] b) 写一个字节数组出去
            byte[] bytes = {'a','b',99,};
            byte[] bytes1 = "你好世界".getBytes(StandardCharsets.UTF_8);//将中文转换成字节写出
            os.write(bytes);
            os.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行
            os.write(bytes1);
            os.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行

            // write(byte[] b,int pos,int len) 写一个字节数组的部分出去
            os.write(bytes,0,2);//从0开始 读 两个字节
            os.write("\r\n".getBytes(StandardCharsets.UTF_8));//换行

            //刷新数据 为了把缓存的数据写入到文件 生效文件
            //os.flush();
            os.close(); // 释放资源,包含了刷新的。
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
