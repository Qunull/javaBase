package 基础.java.测试.第二章.作业;

import java.util.Scanner;

public class WangHao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入张萌的成绩：");
        int b = input.nextInt();
        int a = 80;
        if ( b >= a ){
            System.out.println("张萌的成绩是："+b);
        }else {
            System.out.println("王浩的成绩为：80");
        }
    }
}
