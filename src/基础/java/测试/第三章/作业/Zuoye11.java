package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("STB的成绩是：");
        int a = input.nextInt();
        System.out.print("Java的成绩是：");
        int b = input.nextInt();
        System.out.print("SQL的成绩是：");
        int c = input.nextInt();
        System.out.println("--------------------");
        System.out.println("STB\t\tJava\tSQL");
        System.out.println(a+"\t\t"+b+"\t\t"+c);
        System.out.println("--------------------");
        int d = b-c;
        double e = (a+b+c)/3;
        System.out.println("Java和SQL的成绩差："+d);
        System.out.println("三门课的平均分是："+e);
    }
}
