package com.cn.reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //需求:反射实现泛型擦除后，加入其他类型的元素
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass()==list2.getClass());
        //Integer类型集合加入 String类型
        Class c = list2.getClass();
        //获取C类中的add方
        Method add = c.getDeclaredMethod("add",Object.class);
        add.setAccessible(true);
        //编辑成Class文件进行运行时，泛型会被擦除
        add.invoke(list2,"测试");
        System.out.println(list2);
    }
}
