package 数组作业;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            int[] aa = new int[10];
            System.out.println("请输入第"+(i+1)+"个班级的成绩：");
            for (int j = 0; j < 10; j++) {
                System.out.print("第"+(j+1)+"个同学的成绩：");
                int a = input.nextInt();
                aa[j] = a;
                sum += a;
            }
            int avg = sum/10;
            System.out.println("第"+(i+1)+"个班级平均分："+avg);
            int cc = 0;
            for (int j = 0; j < aa.length; j++) {
                if (aa[j] >= avg){
                    cc++;
                    System.out.println("大于平均分的成绩："+aa[j]);
                }
            }
            System.out.println("大于平均分的人数："+cc);
        }
    }
}
