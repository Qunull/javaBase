package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的存款(万)：");
        double a = input.nextDouble();
        if (a >= 500){
            System.out.println("凯迪拉克");
        }else if (a >= 100){
            System.out.println("帕萨特");
        }else if (a >= 50){
            System.out.println("伊兰特");
        }else if (a >= 10){
            System.out.println("奥拓");
        }else {
            System.out.println("捷安特");
        }
    }
}
