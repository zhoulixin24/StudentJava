package com.cn.ObjectStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 21:41
 *
 * 对象序列化
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        //1。创建对象
        Student s = new Student("周李鑫","zlx","123456");
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\aaa\\data.txt"));
        ){
            oos.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
