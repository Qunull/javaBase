package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入随机数范围的起始数：");
        int a = input.nextInt();
        System.out.println("请输入随机数范围的结尾数：");
        int b = input.nextInt();
        int c = (int)(Math.random()*10);
        int d = (int)(Math.random()*10);
        int e = c*d;
        int f = a+e;
        if (f<=b){
            System.out.println(f);
        }else {
            System.out.println(b);
        }
    }
}
