package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入比赛成绩（s）：");
        double a = input.nextDouble();
        if (a <= 10){
            System.out.println("请输入性别：");
            char b = input.next().charAt(0);
            if (b == '男'){
                System.out.println("进入男子组决赛！");
            }else {
                System.out.println("进入女子组决赛！");
            }
        }else {
            System.out.println("未进入决赛");
        }
    }
}
