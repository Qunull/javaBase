package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] price = new double[5];
        double sum = 0;
        for (int i = 0; i < price.length; i++) {
            System.out.print("请输入第"+(i+1)+"笔购物金额：");
            price[i] = input.nextDouble();
            sum += price[i];
        }
        System.out.println("序号\t\t\t金额（元）");
        for (int i = 0; i < price.length; i++) {
            System.out.println((i+1)+"\t\t\t"+price[i]);
        }
        System.out.println("总金额\t\t"+sum);
    }
}
