package 基础.java.测试.第五章;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int a = input.nextInt();
        int c = a;
        int d = a;
        while (a != 0) {
            System.out.println("输入一个整数：");
            a = input.nextInt();
            if (a == 0) {
                break;
            }
            if (a > c) {
                c = a;
            } else if (a < d) {
                d = a;
            }
        }
        System.out.println("最大数：" + c);
        System.out.println("最小数：" + d);
    }
}
