package cn.com.Thread_Synchronized_Code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 阿甩甩
 * Create by 2022/9/15 21:33
 *
 * 模拟用户账户
 */
public class Account {
    private String cardId;
    private double money;
    //final 修饰之后 是唯一不可替换可修改的
    private final Lock lock = new ReentrantLock();

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 取钱
     * @param money
     *
     * 同步代码块
     */
//    public void drawMoney(double money) {
//        //先获取谁来取钱
//        String name =Thread.currentThread().getName();
//        //放入唯一对象 没有意义，只是一个模拟代表
//        synchronized ("zhoulixin") {
//            //1.判断账户是否够钱
//            if (this.money>=money){
//                System.out.println(name+"取钱:"+money);
//                this.money-=money;
//                System.out.println(name+"剩余:"+this.money);
//            }else {
//                System.out.println(name+"钱不够");
//            }
//        }
//
//    }

    /**
     * 取钱
     * @param money
     *
     * 同步方法
     */
//    public synchronized void drawMoney(double money) {
//        //先获取谁来取钱
//        String name =Thread.currentThread().getName();
//        //放入唯一对象 没有意义，只是一个模拟代表
//            //1.判断账户是否够钱
//            if (this.money>=money){
//                System.out.println(name+"取钱:"+money);
//                this.money-=money;
//                System.out.println(name+"剩余:"+this.money);
//            }else {
//                System.out.println(name+"钱不够");
//            }
//    }

    /**
     * 取钱
     * @param money
     * Lock锁
     */
    public synchronized void drawMoney(double money) {
        //先获取谁来取钱
        String name =Thread.currentThread().getName();
        //放入唯一对象 没有意义，只是一个模拟代表
        //1.判断账户是否够钱
        lock.lock();//上锁
        try {
            if (this.money>=money){
                System.out.println(name+"取钱:"+money);
                this.money-=money;
                System.out.println(name+"剩余:"+this.money);
            }else {
                System.out.println(name+"钱不够");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //放到finally ,不管如何都会解锁
            lock.unlock();//解锁
        }
    }
}
