package com.cn.PrintStremDemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 22:04
 *
 * 打印流 既搞笑又方便
 */
public class PrinTest {
    public static void main(String[] args) throws FileNotFoundException {
        //1 创一个打印流对象
        PrintStream ps = new PrintStream("D:\\aaa\\printStream.txt");
        ps.println("周李鑫");
        ps.println(98);
        ps.close();
    }
}
