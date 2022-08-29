package com.cn.Stream;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author 阿甩甩
 * 体验stream的方便
 * Create by 2022/8/29 10:53
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","赵明");
        //1.从集合中找出姓张的放入心的集合
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                newList.add(s);
            }
        }
        System.out.println(newList);
        //2.找出长度为3
        List<String> newList2 = new ArrayList<>();
        for (String s : newList) {
            if (s.length()==3){
                newList2.add(s);
            }
        }
        System.out.println(newList2);
        //3.使用Stream流
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
    }
}
