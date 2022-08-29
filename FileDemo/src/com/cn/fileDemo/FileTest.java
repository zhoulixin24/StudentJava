package com.cn.fileDemo;

import java.io.File;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 21:21
 */
public class FileTest {
    public static void main(String[] args) {
        //1.创建File对象(直接文件路径，可以存在，也可以不存在) 取到文件对象
        //绝对路径
        // File file = new File("D:/aaa/1.jpg");
        //File file = new File("D:\\aaa\\1.jpg");
        File file = new File("D:"+File.separator+"aaa"+File.separator+"1.jpg");//FIle.separator==文件分隔符

        //2.相对路径：一般定位模块中的文件的 相对到工程下
        File file2 = new File("FileDemo/src/com/cn/data.txt");
        long size = file.length(); // 文件的字节大小
        System.out.println(size);
        System.out.println(file2.length());

        //3.File创建对象，可以是文件夹
        File file3 = new File("D:/aaa");
        System.out.println(file3.exists());//exists判断文件夹是否存在
    }
}
