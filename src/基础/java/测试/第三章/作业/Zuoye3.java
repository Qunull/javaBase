package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入张浩的Java成绩：");
        int a = input.nextInt();
        if (a>98){
            System.out.println("MP4");
        }else {
            System.out.println("惩罚编码");
        }
    }
}
