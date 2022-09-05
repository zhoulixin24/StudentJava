package com.cn.recursionDemo;

/**
 * @author 阿甩甩
 * Create by 2022/8/29 22:22
 */
public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(f2(5));
        System.out.println(f3(1));
    }
    //递归阶乘
    public static int f(int n){
        if (n==1){
            return 1;
        }
        return  f(n-1)*n;
    }
    //递归1-n的和
    public static int f2(int n){
        if (n==1){
            return 1;
        }
        return  f2(n-1)+n;
    }


    /*猴子吃桃子：n/2 -1
    * f(x)-f(x)/2 -1 = f(x+1)
    * 2f(x) - f(x) -2 = 2f(x+1)
    * f(x)=2f(x+1)+2
    * */
    public static int f3(int n){
        if (n==10){
            return 1;
        }
        return  2*f3(n+1)+2;
    }
}
