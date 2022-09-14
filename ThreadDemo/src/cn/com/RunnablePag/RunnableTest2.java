package cn.com.RunnablePag;

/**
 * @author 阿甩甩
 * Create by 2022/9/14 21:55
 * 多线程实现方式：实现Runnable通过匿名内部类的形式
 * 优点:扩展性强
 * 缺点：编程多一层对象包装，不能反回结果
 */
public class RunnableTest2 {
    public static void main(String[] args) {
        //4.把任务对象交给thread处理
        Thread thread = new Thread(()-> {
                for (int i = 0 ;i<100;i++){
                    System.out.println("子线程输出："+i);
                }
        });
        //5.启动线程
        thread.start();
        for (int i = 0 ;i<100;i++){
            System.out.println("主线程输出："+i);
        }
    }
}
