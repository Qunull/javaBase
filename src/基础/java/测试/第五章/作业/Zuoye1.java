package 基础.java.测试.第五章.作业;

import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入消费金额：");
        double money = input.nextDouble();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2：满100元，加3元换购500ml可乐1瓶");
        System.out.println("3：满100元，加10元换购5公斤面粉");
        System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
        System.out.println("5：满200元，加20元可换购欧莱雅爽肤水1瓶");
        System.out.println("0：不换购");
        System.out.println("请选择：");
        int a = input.nextInt();
        double sum ;
        switch (a){
            case 1:
                if (money >= 50) {
                    sum = money + 2;
                    System.out.println("本次消费金额："+sum);
                    System.out.println("成功换购：百事可乐饮料1瓶。");
                    break;
                }else {
                    System.out.println("您的条件不足");
                    break;
                }
            case 2:
                if (money >= 100) {
                    sum = money + 3;
                    System.out.println("本次消费金额："+sum);
                    System.out.println("成功换购：500ml可乐1瓶。");
                    break;
                }else {
                    System.out.println("您的条件不足");
                    break;
                }
            case 3:
                if (money >= 100) {
                    sum = money + 10;
                    System.out.println("本次消费金额："+sum);
                    System.out.println("成功换购：5公斤面粉。");
                    break;
                }else {
                    System.out.println("您的条件不足");
                    break;
                }
            case 4:
                if (money >= 200) {
                    sum = money + 10;
                    System.out.println("本次消费金额："+sum);
                    System.out.println("成功换购：1个苏泊尔炒菜锅。");
                    break;
                }else {
                    System.out.println("您的条件不足");
                    break;
                }
            case 5:
                if (money >= 200) {
                    sum = money + 20;
                    System.out.println("本次消费金额："+sum);
                    System.out.println("成功换购：欧莱雅爽肤水1瓶。");
                    break;
                }else {
                    System.out.println("您的条件不足");
                    break;
                }
            case 0:
                sum = money;
                System.out.println("本次消费金额："+sum);
            default:
                System.out.println("选择错误");
        }
    }
}
