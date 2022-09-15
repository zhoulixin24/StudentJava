package cn.com.Thread_Synchronized_Code;

/**
 * @author 阿甩甩
 * Create by 2022/9/15 21:35
 *
 * 取钱的线程类
 */
public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String name){
        super(name);
        this.acc=acc;
    }

    @Override
    public void run() {
        //取钱
        acc.drawMoney(5);
    }
}
