package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int a = input.nextInt();
        if (a == 100){
            System.out.println("买一辆车");
        }else if (a >= 90){
            System.out.println("MP4");
        }else if (a >= 60){
            System.out.println("参考书");
        }else {
            System.out.println("无");
        }
    }
}
