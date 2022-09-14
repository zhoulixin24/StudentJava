package cn.com.API;

/**
 * @author 阿甩甩
 * Create by 2022/9/14 21:41
 */
public class ThreadTest {
    public static void main(String[] args) {

        Thread t1 = new MyThread("1号");
        //setName() 设置线程名
        //t1.setName("1号");
        t1.start();
        //getName() 获取线程名
        System.out.println(t1.getName());
        Thread t2 = new MyThread("2号");
        //t2.setName("2号");
        t2.start();
        System.out.println(t2.getName());
        //currentThread,获取当前线程
        Thread m = Thread.currentThread();
        System.out.println(m);
    }
}

