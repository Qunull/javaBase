package IO.作业2;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = 111111;
        int a = 1;
        while (a <= 3) {
            System.out.print("请输入密码：");
            int b = input.nextInt();
            if (b == password){
                while (true){
                    System.out.println("请输入取款金额：（100的倍数，最高1000）");
                    int c = input.nextInt();
                    if (c>= 100 && c <= 1000 && c % 100 == 0){
                        System.out.println("交易完成，请取卡！");
                        System.out.println("获得金额："+c);
                        break;
                    }
                }
                break;
            }
            a++;
            if (a > 3){
                System.out.println("密码尝试三次失败！");
            }
        }
    }
}
