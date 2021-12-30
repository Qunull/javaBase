package 面向对象.考试1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
        System.out.print("输入开户人姓名：");
        account.setName(input.next());
        System.out.print("输入开户人ID：");
        account.setId(input.next());
        Account aa = new Account();
        aa.setId("666666");
        aa.setName("秦始皇");
        boolean y = true;
        do {
            System.out.println("请选择您的操作：1.存钱 2.取钱 3.转账 4.退出");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请放入钞票：");
                    double money = input.nextDouble();
                    account.deposit(money);
                    System.out.println(account.toString());
                    break;
                case 2:
                    System.out.println("请输入要取出的钞票：");
                    double money1 = input.nextDouble();
                    account.withdraw(money1);
                    System.out.println(account.toString());
                    break;
                case 3:
                    System.out.println("请输入要转出的金额：");
                    double money2 = input.nextDouble();
                    account.transfer(aa, money2);
                    System.out.println(account.toString());
                    System.out.println(aa.toString());
                    break;
                case 4:
                    y = false;
                    break;
            }
        } while (y == true);

    }
}
