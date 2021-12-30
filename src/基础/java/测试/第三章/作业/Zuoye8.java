package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入第一个整数：");
        int a = input.nextInt();
        System.out.println("输入第二个整数：");
        int b = input.nextInt();
        if (((a/b) == 0 )||(a+b)>1000){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
