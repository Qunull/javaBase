package 基础.java.测试.第二章.作业;

import java.util.Scanner;

public class ChengJi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("语文成绩：");
        int a = input.nextInt();
        System.out.print("数学成绩：");
        int b = input.nextInt();
        System.out.print("英语成绩：");
        int c = input.nextInt();
        System.out.print("计算机成绩：");
        int d = input.nextInt();
        int e = a+b+c+d;
        System.out.println("总分为："+e);
        int f = e/4;
        System.out.println("平均成绩为："+f);
    }
}
