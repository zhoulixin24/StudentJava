package com.cn.PropertiesDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 22:20
 *
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //使用Properties 把键值对信息存入到属性文件中去
        Properties properties = new Properties();
        properties.setProperty("账号","周李鑫");
        properties.setProperty("嘻嘻嘻","123");
        System.out.println(properties);
        /*
        * 参数一：保存管道 字符输出流管道
        * 参数二：保存心得
        * */
        properties.store(new FileWriter("FileDemo/src/com/cn/outData.properties"),"this is users!!");

    }
}
