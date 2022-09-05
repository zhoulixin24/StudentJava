package com.cn.charStream;

import java.io.FileReader;
import java.io.Reader;

/**
 * @author 阿甩甩
 * Create by 2022/9/5 22:17
 *
 * 字符流-- 一次读取一个字符数组
 */
public class FileReaderTest2 {
    public static void main(String[] args) {
        try(
                Reader reader = new FileReader("FileDemo/src/com/cn/readerTest.txt")
        ) {
            //创建一个字符数组
            char[] chars = new char[1024];
            // 记录一个len,记录数组装了多少字符，读多少就倒多少
            int len;
            while ((len = reader.read(chars))!=-1){
                String rs = new String(chars,0,len);
                System.out.println(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
