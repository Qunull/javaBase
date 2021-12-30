package 基础.java.测试;

import java.util.Scanner;

public class Zuoye7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 1;
        int sum1 = 1;
        for (int a = 0;a < 10; a++){//1 1 2 3
// 1 1 2 3 5 8 13 21 34 55 89 144 233 377
// +0 +1 +1 +2 +3 +5
            //斐波那契数列
            //a + a = b a+b=c b+c =d
            System.out.print(sum+"\t");
            System.out.print(sum1+"\t");
            sum = sum+sum1;
            sum1 = sum1+sum;
        }
    }
}
