package com.cn.reflect_class;

//获取类的构造器 - 反射
public class Test {
    public static void main(String[] args) throws Exception {
        //第一种方式 Class类中的静态方法 forName("包名+类名")
        Class cla1 = Class.forName("com.cn.reflect_class.Student");
        System.out.print(cla1);
        //第二种方式 类名.class
        Class cla2 = Student.class;
        System.out.print(cla2);
        //第三种方式 对象.getClass();
        Student s = new Student();
        Class cla3 = s.getClass();
        System.out.print(cla3);
    }

}
