package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        double b = 0;
        while (a <= 5){
            System.out.print("请输入第"+a+"个同学的身高:");
            b += input.nextDouble();
            a++;
        }
        System.out.println("平均身高为："+(b/5));
    }
}
