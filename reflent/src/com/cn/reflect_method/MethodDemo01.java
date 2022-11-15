package com.cn.reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

public class MethodDemo01 {
    /**
     * 提取所有方法
     */
    @Test
    public void getDeclareMehtods(){
        //获取类对象
        Class c = Dog.class;
        //获取全部方法 包括私有 getMethods 不能获取私有方法
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"--"+method.getTypeParameters()+"--"+method.getReturnType());
        }
    }
    /**
     * 提取单个方法
     */
    @Test
    public void getDeclareMehtod() throws Exception {
        //获取类对象
        Class c = Dog.class;
        //获取单个方法 包括私有 getMethods 不能获取私有方法
        Method method = c.getDeclaredMethod("eat",String.class);
        System.out.println(method.getName()+"--"+method.getTypeParameters()+"--"+method.getReturnType());

        //触发方法的执行
        Dog d = new Dog();
        //invoke 获取成员方法依然是在某个对象中进行执行此方法
        // 参数一:用obj对象调用该方法，参数二调用方法的传递的参数(如果没有就不写)
        // 返回值:方法的返回值
        Object obj = method.invoke(d,"你好");
        System.out.println(obj);
    }
}
