package com.cn.reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

/***
 * 通过反射获取类的构造器
 */
public class TestStudent1 {
    //获取全部构造器:只获取public修饰的构造器
    @Test
    public void getConstructors(){
        //1.获取类对象
        Class c = Student.class;
        //2.获取类构造器
        Constructor[] constructors = c.getConstructors();
        //3.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"====="+constructor.getParameters().length);
        }
    }

    //获取全部构造器:获取所有的构造器
    @Test
    public void getDeclaredConstructors(){
        //1.获取类对象
        Class c = Student.class;
        //2.获取类构造器
        Constructor[] constructors = c.getDeclaredConstructors();
        //3.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"====="+constructor.getParameters().length);
        }
    }
    //获取某一个构造器:只获取public修饰的构造器
    @Test
    public void getConstructor() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.获取类构造器
        Constructor constructor = c.getConstructor();
        //3.遍历构造器
            System.out.println(constructor.getName()+"====="+constructor.getParameters().length);

    }

    //获取某一个构造器:获取任何类型的构造器
    @Test
    public void getDeclaredConstructor() throws Exception {
        //1.获取类对象
        Class c = Student.class;
        //2.获取类构造器
        Constructor constructor = c.getDeclaredConstructor();
        //3.遍历构造器
        System.out.println(constructor.getName()+"====="+constructor.getParameters().length);
        //拿有参构造器
        Constructor constructor2 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor2.getName()+"====="+constructor2.getParameters().length);

    }
}
