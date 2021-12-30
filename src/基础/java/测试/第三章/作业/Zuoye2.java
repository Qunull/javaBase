package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入张浩的Java成绩：");
        int a = input.nextInt();
        System.out.print("请输入张浩的音乐成绩：");
        int b = input.nextInt();
        if ((a>98 && b>80) || (a==100 && b>70)){
            System.out.println("奖励");
        }else {
            System.out.println("无");
        }
    }
}
