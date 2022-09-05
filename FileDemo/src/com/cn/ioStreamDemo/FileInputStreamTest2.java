package com.cn.ioStreamDemo;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author 阿甩甩
 * Create by 2022/8/31 21:37
 *
 *读字节数组 read(byte[] buffer)
 */
public class FileInputStreamTest2  {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream(new File("FileDemo/src/com/cn/data.txt"));
            //1.定义一个字节数组

            byte[] b = new byte[3];//一般读1024个字节 1kb
            int len ;
            while ((len=f.read(b))!=-1){
                String rs = new String(b,0,len);//把读取到的字节转码,读多少倒多少
                System.out.print(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
