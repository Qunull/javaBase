package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = input.nextInt();
        int b = a%5;
        if (b == 0){
            System.out.println("5的倍数");
        }else {
            System.out.println("不是5的倍数");
        }
    }
}
