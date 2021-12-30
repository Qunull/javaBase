package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入商品单价：");
        double a = input.nextDouble();
        System.out.println("请输入商品数量：");
        int b = input.nextInt();
        System.out.println("应付金额"+a*b);
    }
}
