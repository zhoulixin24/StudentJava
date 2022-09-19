package cn.com.ThreadPool;

import java.util.concurrent.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/19 21:37
 *
 * 使用Executors的工具方法直接的到一个线程池对象
 * 缺点：1.不能抗住大量任务的操作，2.会自己创建大量线程
 */
public class ThreadPoolTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool =  Executors.newFixedThreadPool(3); //1.不能抗住大量任务的操作
        //ExecutorService pool =  Executors.newCachedThreadPool(); 遇到大的线程会自己创建大量线程

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
    }
}
