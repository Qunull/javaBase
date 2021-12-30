package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("请输入第"+(i+1)+"个人的分数：");
            num[i] = input.nextInt();
            sum += num[i];
        }
        System.out.println("平均分为："+(sum/ num.length));
    }
}
