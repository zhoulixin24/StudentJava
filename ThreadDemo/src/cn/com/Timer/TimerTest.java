package cn.com.Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 阿甩甩
 * Create by 2022/9/21 22:13
 * Timer 定时器的使用和了解
 */
public class TimerTest {
    public static void main(String[] args) {
            //创建Timer定时器
        Timer timer = new Timer();
        //调用方法，处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() +"执行一次");
            }
        },3000,2000);
    }
}
