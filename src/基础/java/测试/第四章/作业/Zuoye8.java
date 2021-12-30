package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入Java考试成绩：");
        int a = input.nextInt();
        if (a >= 90){
            System.out.println("优秀");
        }else if (a >= 80){
            System.out.println("良好");
        }else if (a >= 70){
            System.out.println("中等");
        }else if (a >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
