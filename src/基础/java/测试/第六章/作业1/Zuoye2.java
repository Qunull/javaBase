package 基础.java.测试.第六章.作业1;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 1;
        System.out.println("请输入数字的阶乘(1-10)：");
        int a = input.nextInt();
        if (a > 10){
            System.out.println("输入错误！");
        }else if (a < 1){
            System.out.println("输入错误！");
        }else {
            System.out.print(a+"！=");
            for (int b = a;b >= 1;b--){
                System.out.print(b);
                if (b == 1) {
                    continue;
                }else {
                    System.out.print("*");
                }
                sum = sum*b;
            }
            System.out.println("="+sum);
        }
    }
}
