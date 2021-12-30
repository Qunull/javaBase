package 面向对象.多态.作业;

import java.util.Scanner;

public class StoreTset {
    public Store store(Store store){
        if (store instanceof DirectSale){
            ((DirectSale) store).show();
            return new DirectSale();
        }
        if (store instanceof Franchise){
            ((Franchise) store).show();
            return new Franchise();
        }
        if (store instanceof Discount) {
            ((Discount) store).show();
            return new Discount();
        }
        return store;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StoreTset storeTset = new StoreTset();
        DirectSale directSale = new DirectSale();
        Franchise franchise = new Franchise();
        Discount discount = new Discount();
        Store a = null;
        System.out.println("选择进入的店铺：(1.直营店 2.加盟店 3.折扣店)");
        int b = input.nextInt();
        switch (b){
            case 1:
                a = directSale;
                break;
            case 2:
               a = franchise;
                break;
            case 3:
                a = discount;
                break;
        }
        storeTset.store(a);
        if (a instanceof DirectSale){
            System.out.println("输入直营店金额：");
            int money = input.nextInt();
            System.out.println("输入需要的人数：");
            int num = input.nextInt();
            if (num > 1){
                System.out.println("对不起");
            }else {
                System.out.println("可以送货上门");
            }
        }
        if (a instanceof Franchise){
            System.out.println("输入加盟店金额：");
            int money1 = input.nextInt();
            if (money1 < 1000000){
                System.out.println("对不起");
            }else {
                System.out.println("可以加盟");
            }
        }
        if (a instanceof Discount) {
            System.out.println("输入折扣店购买金额：");
            int money2 = input.nextInt();
            if (money2 < 1000000){
                System.out.println("对不起");
            }else {
                System.out.println("可以享受折扣");
            }
        }
    }
}
