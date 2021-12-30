package IO.作业2;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int count = 0;
        int count1 = 0;
        while (a <= 10) {
            System.out.print("请输入一个数：");
            double b = input.nextDouble();
            if (b != 999) {
                if (b > 0) {
                    if ((b % 1) == 0) {
                        int c = (int) b;
                        count = count + c;
                        count1++;
                    }
                }
            }else {
                break;
            }
            a++;
        }
        System.out.println("正整数次数："+count1+",正整数和"+count);
    }
}
