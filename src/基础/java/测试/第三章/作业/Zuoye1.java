package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入张浩的成绩：");
        int a = input.nextInt();
        if (a>98){
            System.out.println("获得一个mp3");
        }else {
            System.out.println("无");
        }
    }
}
