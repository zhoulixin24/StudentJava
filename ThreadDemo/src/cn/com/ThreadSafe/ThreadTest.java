package cn.com.ThreadSafe;

/**
 * @author 阿甩甩
 * Create by 2022/9/15 21:33
 * 模拟取钱案例
 */
public class ThreadTest {
    public static void main(String[] args) {
        Account acc = new Account("111",7.9);
        //创建两个线程对象，代表小敏，小红
        new DrawThread(acc,"小敏").start();
        new DrawThread(acc,"小红").start();
    }
}
