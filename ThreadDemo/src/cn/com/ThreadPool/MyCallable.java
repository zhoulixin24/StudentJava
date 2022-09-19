package cn.com.ThreadPool;

import java.util.concurrent.Callable;

//1.定义一个任务类。实现Callable接口，应该声明线程任务执行完毕后返回的结果类型
public class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2.重写call方法
    @Override
    public String call() throws Exception {
        int sum =0;
        for (int i =0 ; i<n ;i++){
            sum+=i;
        }
        return Thread.currentThread().getName()+"子线程的执行1-"+n+"结果"+sum;
    }
}
