package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入名次：");
        int a = input.nextInt();
        switch (a){
            case 1:
                System.out.println("参加麻省理工大学组织的夏令营");
                break;
            case 2:
                System.out.println("奖励惠普笔记本电脑一部");
                break;
            case 3:
                System.out.println("奖励移动硬盘一个");
                break;
            default:
                System.out.println("无");
        }
    }
}
