package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] price = new int[4];
        System.out.println("请输入4家店的价格");
        int min = price[0];
        for (int i = 0; i < price.length; i++) {
            System.out.print("第"+(i+1)+"店的价格：");
            price[i] = input.nextInt();
            price[0] = min;
            if (min == 0){
                min = price[i];
            }
            if (min > price[i]){
                min = price[i];
            }
        }
        System.out.println("最低价格："+min);
    }
}
