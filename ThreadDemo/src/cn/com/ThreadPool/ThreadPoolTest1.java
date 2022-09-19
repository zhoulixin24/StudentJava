package cn.com.ThreadPool;

import java.util.concurrent.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/19 21:17
 *
 * 自定义 一个线程对象，并测试其特性
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        //创建线程池对象
        //ThreadPoolExecutor.AbortPolicy
        //丢弃任务并抛出RejectedExecutionException:异常。是默认的策略
        //ThreadPoolExecutor.DiscardPolicy:
        //丢弃任务，但是不抛出异常这是不推荐的做法
        //ThreadPoolExecutor.DiscardoldestPolicy
        //抛弃队列中等待最久的任务然后把当前任务加入队列中
        //ThreadPoolExecutor.CallerRunsPolicy
        //由主线程负责调用任务的un0方法从而绕过线程池直接执行
        ExecutorService pool = new ThreadPoolExecutor(3,3,6,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(6),new ThreadPoolExecutor.AbortPolicy());
        Runnable runnable = new MyRunnable();
        // 扔进线程池
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);
        pool.execute(runnable);

    }
}
