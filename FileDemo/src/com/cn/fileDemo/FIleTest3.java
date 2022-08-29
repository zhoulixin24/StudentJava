package com.cn.fileDemo;

import java.io.File;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 22:04
 */
public class FIleTest3 {
    public static void main(String[] args) {
        File file = new File("FileDemo/src/com/cn/test");
        System.out.println(file.mkdirs());
        file.delete();
    }
}
