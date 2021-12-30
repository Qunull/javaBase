package 基础.java.测试.第四章;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //循环 while do-while for
        Scanner input = new Scanner(System.in);
       /* System.out.println("输入循环次数");
        int a = input.nextInt();
        int b = 0;
        while (b < a){
            System.out.println("");
            b++;
        }*/
        //偶数和
        /*int a = 0;
        int sum = 0;//和
       *//* while (a <= 100){
            System.out.println(a);
            a+=2;
        }*//*
        while (a <= 100){
            if (a%2 == 0){
               System.out.println(a);
            }
            sum+=a;
            a++;
        }
        System.out.println(sum);
        int b = 0;
        int c = 0;
        while (b<=10){
            System.out.println(b);
            c+=b;
            b++;
        }
        //奇数和
        System.out.println(c);*/
        /*int a = 1;
        int b = 0;
        while (a<100){
            System.out.println(a);
            b+=a;
            a+=2;
        }
        System.out.println(b);*/
        //5门课累加
       /* System.out.println("请输入学生姓名：");
        String a = input.next();
        int b = 1;
        double d = 0;
        while (b<=5){
            System.out.print("请输入5门功课中第"+b+"门课的成绩：");
            int c = input.nextInt();
            d+=c;
            b++;
        }
        double e = d/5;
        System.out.println(a+"的平均分为："+e);*/
        //100-0
       /* int a = 0;
        while (a<100){
            System.out.println(100-a);
            a++;
        }*/
        System.out.println("输入数字");
        boolean a = input.hasNextInt();
        System.out.println(a);
        if (a == true){
            System.out.println("正确");
        }else {
            System.out.println("错误");
        }
    }
}
