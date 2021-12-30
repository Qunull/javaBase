package 基础.java.测试.第二章.作业.台风作业;

import java.util.Scanner;

public class WenDu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入温度（华氏温度）：");
        double a = input.nextDouble();
        double b = 5/9.0*(a-32);
        System.out.println("华氏温度为："+a+"摄氏度为："+b);
    }
}
