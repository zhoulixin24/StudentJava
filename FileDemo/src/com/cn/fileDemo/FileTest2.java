package com.cn.fileDemo;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 21:55
 */
public class FileTest2 {
    public static void main(String[] args) {
        File file = new File("D:/aaa/1.jpg");
        //1.获取绝对路径
        System.out.println(file.getAbsolutePath());
        //2.获取文件定义的时候使用的路径
        System.out.println(file.getPath());
        //3.获取文件名称：带后缀
        System.out.println(file.getName());
        //4.获取文件大小
        System.out.println(file.length());
        //5.获取文件最后修改时间
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
        //6.判断是否是文件
        System.out.println(file.isFile());
        //7.判断是否是文件夹
        System.out.println(file.isDirectory());
        //8.判断文件或文件夹是否存在
        System.out.println(file.exists());


    }
}
