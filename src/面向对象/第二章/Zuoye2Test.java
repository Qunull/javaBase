package 面向对象.第二章;

import java.util.Scanner;

public class Zuoye2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zuoye2 a = new Zuoye2();
        System.out.println("请输入五名参赛者的成绩：");
        for (int i = 0; i < a.people.length; i++) {
            int scores = input.nextInt();
            a.people[i] = scores;
        }
        double avg = a.avg();
        System.out.println("平均成绩是："+avg);
        int max = a.max();
        System.out.println("最高成绩是："+max);
        System.out.println("学员低于60的+2：");
        for (int i = 0; i < a.people.length; i++) {
            if (a.people[i] < 60) {
                a.people[i] += 2;
            }
            System.out.print(a.people[i]+"\t");
        }
    }
}
