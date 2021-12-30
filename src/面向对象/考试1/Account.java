package 面向对象.考试1;

import java.util.Date;

public class Account {
    private String id = "admin";
    private String name = "张三";
    private double balance;//余额
    private Date dateCreated = new Date();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    //取款
    public void withdraw(double money) {
        if (balance - money < 0) {
            System.out.println("余额不足！");
        } else {
            balance = balance - money;
            System.out.println("余额：" + balance);
        }
    }

    //存款
    public void deposit(double money) {
        balance = balance + money;
        System.out.println("余额：" + balance);
    }

    //转账
    public void transfer(Account a, double money) {
        if (balance < money) {
            System.out.println("余额不足，转账失败");
        } else {
            balance = balance - money;
            System.out.println("转账成功，余额：" + balance);
        }
    }

    public String toString() {
        return ("账号：" + id + "\t实名：" + name + "\t账户余额：" + balance + "\t开户时间：" + dateCreated);
    }
}
