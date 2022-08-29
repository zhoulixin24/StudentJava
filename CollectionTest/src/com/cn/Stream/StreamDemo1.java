package com.cn.Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 11:11
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        /*Collections集合获取流*/
        Collection<String> list = new ArrayList<>();
        Stream<String> streamList = list.stream();

        /*map 获取流*/
        Map<String,Integer> maps = new HashMap<>();
        // map 键的流
        Stream<String> keyStream = maps.keySet().stream();
        //map 值流
        Stream<Integer> valueStream = maps.values().stream();
        //键值对流
        Stream<Map.Entry<String,Integer>> keyAngValueStream = maps.entrySet().stream();

        /*数组获取Stream*/
        String[] strings = {"1","2"};
        Stream<String> stringStream = Arrays.stream(strings);
    }
}
