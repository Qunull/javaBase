package 基础.java.测试.第二章.作业.台风作业;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本金：");
        double a = input.nextDouble();
        System.out.println("本金为："+a);
        double b = a*(1+0.0225);
        double c = a*(1+0.027*2);
        double d = a*(1+0.0324*3);
        double e = a*(1+0.036*5);
        System.out.println("存取一年后的本息是："+b);
        System.out.println("存取两年后的本息是："+c);
        System.out.println("存取三年后的本息是："+d);
        System.out.println("存取五年后的本息是："+e);

    }
}
