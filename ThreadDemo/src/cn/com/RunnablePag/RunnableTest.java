package cn.com.RunnablePag;

/**
 * @author 阿甩甩
 * Create by 2022/9/14 21:55
 * 多线程实现方式：实现Runnable
 * 优点:扩展性强
 * 缺点：编程多一层对象包装，不能反回结果
 */
public class RunnableTest {
    public static void main(String[] args) {
        //3.创建一个任务对象
        Runnable runnable = new MyRunnable();
        //4.把任务对象交给thread处理
        Thread thread = new Thread(runnable);
        //5.启动线程
        thread.start();
        for (int i = 0 ;i<100;i++){
            System.out.println("主线程输出："+i);
        }
    }
}

//1.定义一个线程任务类，实现Runnable接口
class MyRunnable implements Runnable{

    //2.重写run方法，定义线程的执行任务
    @Override
    public void run() {
       for (int i = 0 ;i<100;i++){
           System.out.println("子线程输出："+i);
       }
    }
}
