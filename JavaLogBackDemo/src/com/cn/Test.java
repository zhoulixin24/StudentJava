package com.cn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 16:43
 * 目标：快速搭建LogBack
 */
public class Test {
    //创建Logback的日志对象，代表日志技术
    public static final Logger LOGGER =  LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法执行了");
            LOGGER.info("记录第二行");
            int a = 10;
            int b =0 ;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);
            System.out.println(a/b);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

    }
}
