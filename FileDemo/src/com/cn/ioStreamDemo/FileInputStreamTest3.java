package com.cn.ioStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author 阿甩甩
 * Create by 2022/8/31 21:37
 *
 * 直接读完 官方给了API readAllBytes
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) {
        try {
            File file = new File("FileDemo/src/com/cn/data.txt");
            InputStream f = new FileInputStream(file);
//            long  siza = file.length(); //获取文件大小
//            //1.定义一个字节数组
//            byte[] b = new byte[(int) siza];
//            int len = f.read(b);
//            System.out.println(len);
//            System.out.println(new String(b));

            System.out.println(new String(f.readAllBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
