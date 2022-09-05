package com.cn.recursionDemo;

import java.io.File;
import java.io.IOException;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 22:53
 * 递归--文件搜索
 */
public class FileSerchTest {
    public static void main(String[] args) {
        //1.先定位出的应该是一级文件对象
        //2.传入目录 和 文件名称
        searchFile(new File("D:/炉石"),"Battle.net.exe");
    }
    /**
     * 1.搜索某个文件夹下的所有文件，找到我们想要的文件
     * @param dir
     * @param fileName
     */
    public static void searchFile(File dir,String fileName){
        if(dir!=null && dir.isDirectory()){
            //获取该目录下的一级目录
            File[] files = dir.listFiles();
            //判断一级目录是否是空文件夹
            if (files!=null && files.length>0){
                //循环遍历一级目录下的文件或者文件夹
                for (File file : files) {
                    if (file.isFile()){
                        if (file.getName().contains(fileName)){
                            System.out.println("所在文件路径:"+file.getAbsolutePath());
                            //启动软件
                            Runtime rt = Runtime.getRuntime();
                            try {
                                rt.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }else {
                        searchFile(file,fileName);
                    }
                }
            }else {
                System.out.println("未找到相关文件");
            }
        }
    }
}
