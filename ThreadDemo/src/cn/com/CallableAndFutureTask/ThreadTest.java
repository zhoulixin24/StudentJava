package cn.com.CallableAndFutureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author 阿甩甩
 * Create by 2022/9/14 22:12
 * JDK5.0：实现Callable和FutureTask
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3创建Callable任务对象
        Callable<String> call = new MyThread(100);
        //4.把Callable对象交给FutureTask
        //FutureTak作用1:是Runnable的对象(实现了Runnable接口，可以交给Thread)
        //FutureTask作用2：可以在线程执行完毕之后通过调用其get()方法可以得到线程执行完毕后的结果
        FutureTask<String> futureTask = new FutureTask<>(call);
        //5.交给线程处理
        Thread thread = new Thread(futureTask);
        //6.启动线程
        thread.start();

        Callable<String> call2 = new MyThread(100);
        FutureTask<String> futureTask2 = new FutureTask<>(call);
        Thread thread2 = new Thread(futureTask2);
        thread2.start();

        try {
            //如果futureTask任务没有执行完毕，这里的代码会等待，知道线程1跑完才会提取结果
            System.out.println("第一个结果："+futureTask.get());
            System.out.println("第二个结果："+futureTask2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//1.定义一个任务类。实现Callable接口，应该声明线程任务执行完毕后返回的结果类型
class MyThread implements Callable<String>{
    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    //2.重写call方法
    @Override
    public String call() throws Exception {
        int sum =0;
        for (int i =0 ; i<n ;i++){
            sum+=i;
        }
        return "子线程的执行结果"+sum;
    }
}
