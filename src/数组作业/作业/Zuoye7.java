package 数组作业.作业;

import java.util.Scanner;

public class Zuoye7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 100;
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.print("请输入分数：");
            int a = input.nextInt();
            if (a <= 100) {
                if (a >= 0) {
                    if (a > max) {
                        max = a;
                    }
                    if (a < min) {
                        min = a;
                    }
                    count++;
                    sum += a;
                }else {
                    break;
                }
            }else {
                System.out.println("最高分为100！");
            }
        }
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均分："+sum/count);
    }
}
