package com.cn.reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 反射-获取成员变量
 */
public class FieldDemo01 {
    /*
    1.获取全部的成员变量
    Field[] getDeclaredFields()
     */
    @Test
    public void getDeclaredFields(){
        //1.获取Class对象
        Class c = Student.class;
        //2.通过Class对象获取全部成员变量
        Field[] fields = c.getDeclaredFields();
        //3遍历一下，看一下获取了哪些
        for (Field field : fields) {
            System.out.println(field.getName()+"==>" + field.getType());
        }
    }
    /*
    2.获取某一个的成员变量 根据变量名称
    Field getDeclaredField(String name)
     */
    @Test
    public void getDeclaredField() throws Exception {
        //1.获取Class对象
        Class c = Student.class;
        //2.通过Class对象获取某个成员变量 根据名称
        Field field = c.getDeclaredField("Name");
        //3遍历一下，看一下获取了哪些
        System.out.println(field.getName()+"==>" + field.getType());
    }
}
