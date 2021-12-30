package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入五位学员的成绩：");
        double sum = 0;
        int[] people = new int[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = input.nextInt();
            sum += people[i];
        }
        System.out.println("平局分为："+(sum/ people.length));
    }
}
