package com.cn.IOKJ;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 22:44
 */
public class CommonsIOTest {
    public static void main(String[] args) throws Exception {
        //利用 commons-IO完成文件复制
        IOUtils.copy(new FileInputStream("D:\\aaa\\00.mov"),new FileOutputStream("D:\\aaa\\11.mov"));
    }
}
