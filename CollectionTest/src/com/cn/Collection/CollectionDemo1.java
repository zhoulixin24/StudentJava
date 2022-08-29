package com.cn.Collection;

import java.util.*;

/**
 * @author 阿甩甩
 * Create by 2022/8/8 16:43
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection collection = new ArrayList();
        collection.add("123");
        collection.add("123");
        collection.add(false);
        collection.add(false);
        collection.add(555);
        collection.add(555);
        System.out.println(collection);
        //无需 不重复 无索引
        Collection collection2 = new HashSet();
        collection2.add("123");
        collection2.add("123");
        collection2.add(false);
        collection2.add(false);
        collection2.add(555);
        collection2.add(555);
        System.out.println(collection2);

    }
}
