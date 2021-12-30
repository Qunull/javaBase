package IO.作业2;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数：");
        double a = input.nextDouble();
        int x = 1;
        if (a > 0){
            if ((a%1)==0){
                int b = (int) a;
                int z = b;
                while (b >= 10){
                    b = b/10;
                    x++;
                }
                int[] c = new int[x];
                for (int i = 0; i < c.length; i++) {
                    c[i] = z % 10;
                    z = z / 10;
                }
                for (int i = 0; i < c.length; i++) {
                    System.out.print(c[i]);
                }
            }else {
                System.out.println("不是整数");
            }
        }else {
            System.out.println("不是正数");
        }
    }
}
