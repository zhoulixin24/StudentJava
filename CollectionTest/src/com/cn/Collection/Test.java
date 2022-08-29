package com.cn.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阿甩甩
 * Create by 2022/8/8 17:19
 */
public class Test {
    public static void main(String[] args) {
        String[] s ={"1","2"};
        List<Games> list = new ArrayList<>();
        list.add(new Games("GTA5"));
        list.add(new Games("游戏"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

