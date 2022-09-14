package cn.com.API;

/**
 * @author 阿甩甩
 * Create by 2022/9/14 22:39
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //currentThread,获取当前线程
            System.out.println(Thread.currentThread().getName() + "输出" + i);
            if (i==3){
                try {
                    //让该线程睡眠3s
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
