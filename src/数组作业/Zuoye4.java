package 数组作业;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int a = input.nextInt();
        int y[] = new int[a];
        int m[] = new int[a];
        int c[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("请输入第"+(i+1)+"人的语文成绩：");
            c[i] = input.nextInt();
            System.out.print("请输入第"+(i+1)+"人的数学成绩：");
            m[i] = input.nextInt();
            System.out.print("请输入第"+(i+1)+"人的英语成绩：");
            y[i] = input.nextInt();
        }
        for (int i = 0; i < c.length-1; i++) {
            for (int j = 0; j < c.length-1-i; j++) {
                if (c[j] < c[j+1]){
                    int cc = c[j];
                    c[j] = c[j+1];
                    c[j+1] = cc;
                }
            }
        }
        if (c.length > 2){
            System.out.println("语文最高分："+c[0]);
            System.out.println("语文最高分："+c[1]);
        }else {
            System.out.println("语文最高分："+c[0]);
        }

        for (int i = 0; i < m.length-1; i++) {
            for (int j = 0; j < m.length-1-i; j++) {
                if (m[j] > m[j+1]){
                    int mm = m[j];
                    m[j] = m[j+1];
                    m[j+1] = mm;
                }
            }
        }
        if (c.length > 2){
            System.out.println("数学最低分："+m[0]);
            System.out.println("数学最低分："+m[1]);
        }else {
            System.out.println("数学最低分："+m[0]);
        }
        int sum = 0;
        for (int i = 0; i < y.length; i++) {
                sum += y[i];
        }
        System.out.println("英语平均分："+(sum/y.length));
    }
}
