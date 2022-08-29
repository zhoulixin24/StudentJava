package com.cn.MapTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author 阿甩甩
 * Create by 2022/8/17 21:45
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("苹果",12);
        map.put("香蕉",1);
        map.put("西瓜",120);
        System.out.println(map);
        map.forEach(( s, integer)-> System.out.println(s+"--->"+integer));
    }
}
