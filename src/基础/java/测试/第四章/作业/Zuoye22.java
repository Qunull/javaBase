package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        while (a <= 3){
            System.out.print("请输入第"+a+"个数字：");
            int b = input.nextInt();
            if (b%2 == 0){
                System.out.println("偶数");
            }else {
                System.out.println("奇数");
            }
            a++;
        }
    }
}
