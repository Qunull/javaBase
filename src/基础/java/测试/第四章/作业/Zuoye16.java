package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int a = input.nextInt();
        if (a >= 60){
            System.out.println("老人");
        }else if (a >= 18){
            System.out.println("成年");
        }else if (a >= 13){
            System.out.println("青少年");
        }else {
            System.out.println("小孩");
        }
    }
}
