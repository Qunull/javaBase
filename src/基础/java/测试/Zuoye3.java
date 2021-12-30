package 基础.java.测试;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("青鸟迷你游戏平台 > 游戏币支付");
        System.out.println("请选择您玩的游戏类型：");
        System.out.println("\t\t1.牌类");
        System.out.println("\t\t2.休闲竞技类");
        int a = input.nextInt();
        System.out.print("请输入游戏时长：");
        int b = input.nextInt();
        switch (a){
            case 1:
                if (b >= 10){
                    sum = (b*5);
                    System.out.println("您玩的是牌类游戏，时长："+b+"小时，可享受5折优惠");
                    System.out.println("您需要支付："+sum+"个游戏币");
                }else {
                    sum = (b*8);
                    System.out.println("您玩的是牌类游戏，时长："+b+"小时，可享受8折优惠");
                    System.out.println("您需要支付："+sum+"个游戏币");
                }
                break;
            case 2:
                if (b >= 10){
                    sum = (b*10);
                    System.out.println("您玩的是休闲竞技类游戏，时长："+b+"小时，可享受5折优惠");
                    System.out.println("您需要支付："+sum+"个游戏币");
                }else {
                    sum = (b*16);
                    System.out.println("您玩的是休闲竞技类游戏，时长："+b+"小时，可享受8折优惠");
                    System.out.println("您需要支付："+sum+"个游戏币");
                }
                break;
            default:
                System.out.println("选择错误");
        }
    }
}
