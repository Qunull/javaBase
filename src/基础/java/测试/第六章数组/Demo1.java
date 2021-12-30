package 基础.java.测试.第六章数组;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("输入第"+(i+1)+"个成绩：");
            a[i] = input.nextInt();
            sum += a[i];
        }
        System.out.println("平均分为："+sum/ a.length);
    }
}
