package 基础.java.测试.第二章.作业.台风作业;

import java.util.Scanner;

public class GongZi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入基本工资：");
        double a = input.nextDouble();
        double b = a*0.4;
        double c = a*0.25;
        double d = a+b+c;
        System.out.println("该员工的工资细目为：");
        System.out.println("基本工资："+a);
        System.out.println("物价津贴为："+b);
        System.out.println("房租津贴："+c);
        System.out.println("员工的薪水为："+d);

    }
}
