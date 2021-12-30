package 基础.java.测试;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("青鸟迷你游戏平台 > 添加用户信息");
        System.out.println("请输入要录入用户的数量：");
        int a = input.nextInt();
        for (int b = 1;b <= a ;b++){
            System.out.print("请输入用户编号（四位整数）");
            int c = input.nextInt();
            System.out.print("请输入用户年龄：");
            int d = input.nextInt();
            System.out.print("请输入会员积分：");
            int e = input.nextInt();
            System.out.println("您录入的会员信息是：");
            System.out.println("用户编号："+c+"\t年龄："+d+"\t积分："+e);
        }
    }
}
