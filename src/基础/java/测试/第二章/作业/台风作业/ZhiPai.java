package 基础.java.测试.第二章.作业.台风作业;

import java.util.Scanner;

public class ZhiPai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输出互换前手中的纸牌：");
        System.out.print("左手中的纸牌：");
        String a = input.next();
        System.out.print("右手中的纸牌：");
        String b = input.next();
        System.out.println("输出互换后手中的纸牌：");
        String c = a;
            a = b;
            b = c;
        System.out.println("左手中的纸牌："+a);
        System.out.println("右手中的纸牌："+b);

    }
}
