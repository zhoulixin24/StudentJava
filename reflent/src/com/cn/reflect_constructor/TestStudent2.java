package com.cn.reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent2 {
    //通过调用构造器 得到一个类对象的返回
    @Test
    public void getDeclaredConstructor() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.获取类构造器
        Constructor constructor = c.getDeclaredConstructor();
        //3.遍历构造器
        System.out.println(constructor.getName()+"====="+constructor.getParameters().length);
        //4.调用构造器 得到一个类对象的返回 如果遇到私有的构造器，可以暴力反射 setAccessible
        constructor.setAccessible(true);
        Student student = (Student) constructor.newInstance();
        System.out.println(student);
        //拿有参构造器
        Constructor constructor2 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor2.getName()+"====="+constructor2.getParameters().length);
        //4.调用构造器 得到一个类对象的返回 如果遇到私有的构造器，可以暴力反射 setAccessible
        constructor.setAccessible(true);
        Student student2 = (Student) constructor2.newInstance("阿甩甩",18);
        System.out.println(student2);

    }
}
