package com.cn.bufferedStream;

import java.io.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/6 21:39
 * 字节缓冲输入流
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        //JDK7
        try (//这里只能放置资源对象，用完会自动关闭，即使出现异常也会做关闭操作
             //创建一个输入流管道与原视频创建沟通
             InputStream is = new FileInputStream("D:/aaa/00.mov");
             //把原始的字节输入流包装成高级的缓冲字节输入流
             InputStream bis = new BufferedInputStream(is);
             //创建输出流 与目标文件沟通
             OutputStream os =  new FileOutputStream("D:/aaa/02.mov");
             //把原始的字节输出流包装成高级的缓冲字节输出流
             OutputStream bos = new BufferedOutputStream((os));
        ) {
            //定义一个字节数组转移数据
            byte[] b = new byte[1024];
            int len;//记录每次读取的字节数
            while ((len = bis.read(b))!=-1){
                bos.write(b,0,len);//将字节组写入目标文件
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
