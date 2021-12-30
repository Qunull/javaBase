package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = input.nextInt();
        if (a%2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
