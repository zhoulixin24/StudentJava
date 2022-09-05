package com.cn.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author 阿甩甩
 * Create by 2022/9/5 22:17
 *
 * 字符流--读取
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try(
                Reader reader = new FileReader("FileDemo/src/com/cn/readerTest.txt")
        ) {
            // 读取一个字符返回，没有的话返回-1
    /*        int code  = reader.read();
            System.out.println((char) code);
            */
            //循环读取数组
            int code;
            while ((code = reader.read())!= -1){
                System.out.println((char) code);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
