package com.cn.ioStreamDemo;

import java.io.FileInputStream;

/**
 * @author 阿甩甩
 * Create by 2022/8/31 11:03
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            //创建一个文件字节输入流管道与源文件接通
            FileInputStream fileInputStream = new FileInputStream("FileDemo/src/com/cn/data.txt");
            //读取一个字节返回
      /*      int b1 = fileInputStream.read();没读到字节会返回 -1；
            System.out.println((char) b1);*/
            //循环读取字节
            int b=0;
            //每次只读一个字节
            while ((b=fileInputStream.read())!=-1){
                System.out.println((char)b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
