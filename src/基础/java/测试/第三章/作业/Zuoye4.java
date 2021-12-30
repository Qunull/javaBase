package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入彩票编号（0-9）：");
        int a = input.nextInt();
        int b =(int)(Math.random()*10);
        System.out.println(b);
        if (a==b){
            System.out.println("中奖");
        }else {
            System.out.println("敬请期待");
        }
    }
}
