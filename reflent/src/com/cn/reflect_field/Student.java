package com.cn.reflect_field;

public class Student {
    private String Name;
    private int Age;

    public static String schoolName;

    public  static  final String COUNTTRY = "中国";

    private Student() {
    }

    public Student(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
