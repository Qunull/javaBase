package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        while (a <= 3){
            System.out.print("请输入课程成绩：");
            int b = input.nextInt();
            a++;
        }
    }
}
