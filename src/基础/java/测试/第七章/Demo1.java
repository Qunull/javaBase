package 基础.java.测试.第七章;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][5];
        int[] sum = new int[3];
        for (int i = 0; i < a.length; i++) {
            System.out.println("**************第"+(i+1)+"个班************");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("请输入第"+(j+1)+"个学生的成绩：");
                a[i][j] = input.nextInt();
                sum[i] += a[i][j];
            }
        }
        System.out.println("**************成绩统计************");
        for (int i = 0; i < sum.length; i++) {
            System.out.println((i+1)+"班平均成绩："+(sum[i]/5));
        }
    }
}
