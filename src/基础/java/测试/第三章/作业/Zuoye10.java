package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String a = input.next();
        System.out.println("请输入你的年龄：");
        int b = input.nextInt();
        System.out.println("请输入你的性别：");
        char c = input.next().charAt(0);
        if (c == '男'){
            System.out.println(a+"是一个"+b+"岁的男生，他很有力气");
        }else {
            System.out.println(a+"是一个"+b+"岁的女生，她很有魅力");
        }
    }
}
