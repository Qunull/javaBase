package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int[] people = new int[5];
        System.out.println("请输入五位学员的成绩：");
        for (int i = 0; i < people.length; i++) {
            people[i] = input.nextInt();
            if (people[i] > max){
                max = people[i];
            }
        }
        System.out.println("考试成绩最高分为："+max);
    }
}
