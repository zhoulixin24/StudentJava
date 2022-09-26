package cn.com.Timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 阿甩甩
 * Create by 2022/9/21 22:23
 * ScheduledExecutorService 定时器
 */
public class ScheduledExecutorServiceTest {
    public static void main(String[] args) {
        //创建ScheduledExecutorService 做定时器 最大3个线程
        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(3);
        //开启定时任务
        scheduledExecutorService.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"執行"+ new Date());
            }
            // 0秒開始==现在就开始 2秒后再次开启 单位秒
        },0,2, TimeUnit.SECONDS);
    }
}
