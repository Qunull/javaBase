package 基础.java.测试.第五章.作业;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MyShopping管理系统 > 购物结算");
        String a = "y";
        do {
            System.out.println("************************************************");
            System.out.println("请选择购买的商品编号：");
            System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
            System.out.println("************************************************");
            System.out.println("请输入商品编号：");
            int num = input.nextInt();
            switch (num){
                case 1:
                    System.out.println("T恤\t￥245.0");
                    break;
                case 2:
                    System.out.println("网球鞋\t￥570.0");
                    break;
                case 3:
                    System.out.println("网球拍\t￥320.0");
                    break;
            }
            System.out.println("是否继续（y/n）");
            a = input.next();
        }while (a.equals("y"));
        System.out.println("结束");
    }
}
