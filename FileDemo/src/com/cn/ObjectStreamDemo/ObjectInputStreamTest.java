package com.cn.ObjectStreamDemo;

import java.io.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 21:50
 * 对象反序列化
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try(    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\aaa\\data.txt"));
        ) {
            Student s = (Student) ois.readObject();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
