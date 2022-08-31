package com.cn.RecursionDemo;

/**
 * @author 阿甩甩
 * Create by 2022/8/31 10:22
 */
/*
需求：啤酒2元1瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶
请问10元钱可以喝多少瓶酒，剩余多少空瓶和盖子。
答案：15瓶3盖子1瓶子
 */
public class PeerProblem {
    public  static int tolalNumber; //总数量
    public  static int lastBottleNumber; //记录每次剩余瓶子总数量
    public  static int lastCoverNumber; //记录每次剩余盖子总数量
    public static void main(String[] args) {
        //1.买酒
        buy(12);
        System.out.println("总数："+tolalNumber);
        System.out.println("剩余瓶子："+lastBottleNumber);
        System.out.println("剩余盖子："+lastCoverNumber);

    }

    public static void buy(int money){
        //2.看了一买多少酒
        int buyNumber = money/2; //2块一瓶
        tolalNumber += buyNumber;

        //3.把盖子和瓶子换算成钱
        int coverNumber = lastCoverNumber +buyNumber;
        int bottleNUmber = lastBottleNumber +buyNumber;
        //统计剩余瓶子和盖子换算的钱
        int allMoney=0;
        if (coverNumber>=4){
            allMoney += (coverNumber/4)*2;
        }
        lastCoverNumber = coverNumber%4;
        if (bottleNUmber>=2){
            allMoney += (bottleNUmber/2)*2;
        }
        lastBottleNumber = bottleNUmber%2;
        if (allMoney>=2){
            buy(allMoney);
        }
    }
}
