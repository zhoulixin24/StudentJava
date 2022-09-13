package com.cn.ObjectStreamDemo;

import java.io.Serializable;

/**
 * @author 阿甩甩
 * Create by 2022/9/13 21:44
 */
public class Student implements Serializable {
    private String name;
    private String loginName;
    //trabsient 修饰的成员不参与序列化
    private transient String password;

    public Student() {
    }

    public Student(String name, String loginName, String password) {
        this.name = name;
        this.loginName = loginName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
