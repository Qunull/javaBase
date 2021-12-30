package 基础.java.测试.第三章;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("请输入名次：");
        int a = input.nextInt();
        *//*if (a == 1){
            System.out.println("1");
        }else if (a == 2){
            System.out.println("2");
        }else if (a == 3){
            System.out.println("3");
        }else {
            System.out.println("无");
        }*//*
        switch (a){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("无");
                break;
        }*/
        System.out.println("请输入月份：");
        int a = input.nextInt();
        switch (a){
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
