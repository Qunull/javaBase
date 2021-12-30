package 基础.java.测试.第六章数组.作业;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] people = new int[5];
        int max = 0;
        System.out.println("请输入5位学员的成绩：");
        for (int i = 0; i < people.length; i++) {
            people[i] = input.nextInt();
        }
        Arrays.sort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.print(people[i]+"\t");
        }
    }
}
