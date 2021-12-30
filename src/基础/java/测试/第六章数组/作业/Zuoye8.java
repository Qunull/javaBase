package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[]{8,4,2,1,23,344,12};
        int sum = 0;
        boolean b = false;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            sum += num[i];
        }
        System.out.println("和为："+sum);
        System.out.println("********************************************");
        System.out.println("输入一个数：");
        int a = input.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (a == num[i]){
                System.out.println("包含");
                b = true;
                break;
            }
        }
        if (b == false){
            System.out.println("不包含");
        }
    }
}
