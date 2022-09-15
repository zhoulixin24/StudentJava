package cn.com.ThreadSafe;

/**
 * @author 阿甩甩
 * Create by 2022/9/15 21:33
 *
 * 模拟用户账户
 */
public class Account {
    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 取钱
     * @param money
     */
    public void drawMoney(double money) {
        //先获取谁来取钱
        String name =Thread.currentThread().getName();
        //1.判断账户是否够钱
        if (this.money>=money){
            System.out.println(name+"取钱:"+money);
            this.money-=money;
            System.out.println(name+"剩余:"+this.money);
        }else {
            System.out.println(name+"钱不够");
        }

    }
}
