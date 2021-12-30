package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int a = input.nextInt();
        if ((a%4 == 0 && a%100 != 0)|| (a%400 == 0)){
            System.out.println("闰年");
        }else {
            System.out.println("不是");
        }
    }
}
