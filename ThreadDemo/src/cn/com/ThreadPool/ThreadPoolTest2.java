package cn.com.ThreadPool;

import java.util.concurrent.*;

/**
 * @author 阿甩甩
 * Create by 2022/9/19 21:37
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
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
        // 扔进线程池
        Future<String> future = pool.submit(new MyCallable(100));
        Future<String> future1 = pool.submit(new MyCallable(200));
        Future<String> future2 = pool.submit(new MyCallable(300));
        Future<String> future3 = pool.submit(new MyCallable(400));

        System.out.println(future.get());
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }
}
