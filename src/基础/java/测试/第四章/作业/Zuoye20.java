package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (a < 3){
            System.out.print("请输入课程成绩：");
            int c = input.nextInt();
            b += c;
            a++;
        }
        System.out.println("平均成绩为："+(b/3));
    }
}
