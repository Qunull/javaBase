package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学员的成绩：");
        int a = input.nextInt();
        if (a >= 80){
            System.out.println("良好");
        }else if (a >= 60){
            System.out.println("中等");
        }else {
            System.out.println("差");
        }
    }
}
