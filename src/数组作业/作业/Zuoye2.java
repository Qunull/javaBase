package 数组作业.作业;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生数量");
        int num = input.nextInt();
        int[] a = new int[num];
        String[] b = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("请输入第"+(i+1)+"个学生的姓名：");
            b[i] = input.next();
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] < a[j+1]){
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;

                    String f = b[j];
                    b[j] = b[j+1];
                    b[j+1] = f;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]+"\t"+a[i]);
        }
    }
}
