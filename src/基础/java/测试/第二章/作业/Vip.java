package 基础.java.测试.第二章.作业;

import java.util.Scanner;

public class Vip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");
        int vip = input.nextInt();
        System.out.println("会员卡号是："+vip);
        int qian = vip/1000;
        int bai = vip/100%10;
        int shi = vip/10%10;
        int ge = vip%10;
        System.out.println("千位数："+qian+"\t"+"百位数："+bai+"\t"+"十位数："+shi+"\t"+"个位数："+ge);
        int zong = qian+bai+shi+ge;
        System.out.println("会员卡号为"+vip+"各位之和："+zong);
    }
}
