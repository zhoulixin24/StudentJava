package cn.com.ThreadPool;

/**
 * @author 阿甩甩
 * Create by 2022/9/19 21:23
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"输出："+i);
        }
    }
}
