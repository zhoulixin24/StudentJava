package com.cn.bufferedStream;

import java.io.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/6 22:04
 * 缓冲字符输入流
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        try(
                //reader 只能读一遍
                Reader reader = new FileReader("D:/aaa/data.txt");
                //字符缓冲输入流
                BufferedReader bs = new BufferedReader(reader);
                Writer writer = new FileWriter("D:/aaa/writerTest.txt");
                //字符缓冲输出流
                BufferedWriter bw = new BufferedWriter(writer);
        ) {
            // 写一个字符
            int code; //定义一个
            //循环读取数组
//            while ((code = reader.read())!= -1){
//                writer.write(code);
//            }
            //写一个 字符数组
            /*char[] chars = new char[1024];
            int len;
            while ((len=bs.read(chars))!=-1){
                bw.write(chars); //写一个 字符数组
                bw.write("\r\n");//直接写字符串
                bw.write(chars,0,len);  //写一个 字符数组中的某一段
                bw.write("\r\n");//直接写字符串

            }*/

            //一行一行的读
            String line;
            while ((line = bs.readLine())!=null){
                bw.write(line);
                bw.newLine();//换行方法
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
