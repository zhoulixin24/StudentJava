package com.cn.IOStreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 阿甩甩
 * Create by 2022/8/31 11:03
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("FileDemo/src/com/cn/data.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
