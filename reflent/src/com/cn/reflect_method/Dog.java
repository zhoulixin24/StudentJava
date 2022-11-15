package com.cn.reflect_method;

public class Dog {
    private  String name;
    public Dog(){

    }
    public Dog(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("狗跑得很快");
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public  String  eat(String name){
        System.out.println(name+"吃骨头");
        return  "很开心";
    }
}
