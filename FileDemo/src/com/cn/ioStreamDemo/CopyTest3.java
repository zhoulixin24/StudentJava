package com.cn.ioStreamDemo;

import java.io.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/5 21:52
 *
 * 学会使用字节流完成文件的复制，支持一切文件的复制
 */
public class CopyTest3 {
    //JDK9 释放资源的方式，不建议使用，还是抛出异常
    public static void main(String[] args) throws FileNotFoundException {
        //创建一个输入流管道与原视频创建沟通
        InputStream is = new FileInputStream("D:/aaa/00.mov");
        //创建输出流 与目标文件沟通
        OutputStream os =  new FileOutputStream("D:/aaa/01.mov");
        try (//这里只能放置资源对象，用完会自动关闭，即使出现异常也会做关闭操作
            is;os;
              ) {
            //定义一个字节数组转移数据
            byte[] b = new byte[1024];
            int len;//记录每次读取的字节数
            while ((len = is.read(b))!=-1){
                os.write(b,0,len);//将字节组写入目标文件
            }
            System.out.println("复制完成");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
