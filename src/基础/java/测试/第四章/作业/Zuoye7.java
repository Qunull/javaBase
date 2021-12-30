package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入购物金额：");
        double a = input.nextDouble();
        if (a >= 500){
            System.out.println("您消费："+a*0.75);
        }else if (a >= 200){
            System.out.println("您消费："+a*0.85);
        }else if (a >= 100){
            System.out.println("您消费："+a*0.9);
        }else {
            System.out.println("您消费："+a);
        }
    }
}
