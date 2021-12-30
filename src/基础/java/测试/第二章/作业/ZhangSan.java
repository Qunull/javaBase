package 基础.java.测试.第二章.作业;

import java.util.Scanner;

public class ZhangSan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("姓名：");
        String a = input.next();
        System.out.print("号码：");
        int b = input.nextInt();
        System.out.println(a+"您好！您的等待号码是"+b);
    }
}
