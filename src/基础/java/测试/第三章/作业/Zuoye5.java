package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = input.nextInt();
        int b = a%2;
        if (b == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
