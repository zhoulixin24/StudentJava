package com.cn.charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * @author 阿甩甩
 * Create by 2022/9/5 22:41
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try(
                //reader 只能读一遍
                Reader reader = new FileReader("FileDemo/src/com/cn/readerTest.txt");
                Writer writer = new FileWriter("FileDemo/src/com/cn/writerTest.txt");
        ) {
            // 写一个字符
            int code; //定义一个
            //循环读取数组
//            while ((code = reader.read())!= -1){
//                writer.write(code);
//            }
            //写一个 字符数组
            char[] chars = new char[5];
            int len;
            while ((len=reader.read(chars))!=-1){
                writer.write(chars); //写一个 字符数组
                writer.write("\r\n");//直接写字符串
                writer.write(chars,1,3);  //写一个 字符数组中的某一段
                writer.write("\r\n");//直接写字符串

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
