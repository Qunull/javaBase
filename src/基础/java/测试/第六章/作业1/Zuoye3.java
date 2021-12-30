package 基础.java.测试.第六章.作业1;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数：");
        int a = input.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
