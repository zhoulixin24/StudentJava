package cn.com.API;

/**
 * 1.定义一个线程类继承Thread类
 */
public class MyThread extends Thread {
    //Thread 构造器，传入线程名字
    public MyThread(String name) {
        super(name);//调用父类构造器
    }

    /**
     * 2. 重写run方法,里面定义线程以后要干啥
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //currentThread,获取当前线程
            System.out.println(Thread.currentThread().getName() + "输出" + i);
        }
    }
}
