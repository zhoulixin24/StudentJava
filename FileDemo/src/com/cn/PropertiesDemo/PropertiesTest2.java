package com.cn.PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 22:26
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        //使用Properties 把键值对信息存入到属性文件中去
        Properties properties = new Properties();
        //加载属性文件中的键值对数据库到属性对象properties中区
        properties.load(new FileReader("FileDemo/src/com/cn/outData.properties"));

        System.out.println(properties);
        System.out.println(properties.getProperty("账号"));

    }
}
