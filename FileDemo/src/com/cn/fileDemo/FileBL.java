package com.cn.fileDemo;

import java.io.File;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 22:10
 */
public class FileBL {
    public static void main(String[] args) {
        File file = new File("D:/aaa");
        String[] names = file.list();//只能拿一级目录
        for (String name : names) {
            System.out.println(name);
        }
        //一级目录
        //获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

        /*listFiles注意事项
        * 当调用者不存在时，返回null
        * 当调用者是一个文件时，返回null
        * 当调用者是一个空文件夹时，返回一个长度为0的数组
        * 当调用者是一个由内容的文件夹时，将里面所有文件和文件夹的路径放在FIle数组中返回
        * 当调用者是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在FIle数组中返回，包含隐藏内容
        * */
        File dir = new File("D:/bbbbbbb");
        File[] files1 = dir.listFiles();
        System.out.println(files1);

    }
}
