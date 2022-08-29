package com.cn.SetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 阿甩甩
 * Create by 2022/8/10 10:38
 */
public class Test {
    public static void main(String[] args) {
        //Set系列集合的特点
        //HashSet 无序 不重复，无索引
        Set<String> sets = new HashSet<>();
        sets.add("周");
        sets.add("周");
        sets.add("李");
        sets.add("李");
        sets.add("鑫");
        sets.add("鑫");
        System.out.println(sets);
        //LinkedHashSet 有序 不重复，无索引
        Set<String> li = new LinkedHashSet<>();
        li.add("周");
        li.add("周");
        li.add("李");
        li.add("李");
        li.add("鑫");
        li.add("鑫");
        System.out.println(li);
        //排序，不重复，无索引
        Set<String> trees = new TreeSet<>();
        trees.add("周");
        trees.add("周");
        trees.add("李");
        trees.add("李");
        trees.add("鑫");
        trees.add("鑫");
        System.out.println(trees);
    }
}
