package 基础.java.测试.第五章;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1 ; i <= 3 ; i ++){
            double sum = 0;
            System.out.println("请输入第"+i+"个班的成绩");
            for (int a = 1;a<=3;a++){
                System.out.print("请输入第"+a+"个同学的成绩:");
                sum += input.nextInt();
            }
            System.out.print("第"+i+"个班的平均分为:"+(sum/3));
        }
    }
}
