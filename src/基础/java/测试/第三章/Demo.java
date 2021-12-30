package 基础.java.测试.第三章;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("请输入你的成绩：");
        double a = input.nextDouble();
        if (a>=90){
            System.out.println("优秀");
        }else if (a>=80){
            System.out.println("良");
        }else if (a>=60){
            System.out.println("中");
        }else {
            System.out.println("差");
        }*/
        /*System.out.println("请输入张浩的Java成绩：");
        double a = input.nextDouble();
        System.out.println("请输入张浩的音乐成绩：");
        double b = input.nextDouble();
        System.out.println("请输入账号的英语成绩：");
        double c = input.nextDouble();
        if ((a>90 && b>80) || (a==100 && b>70)||(a>90 && c>90)){
            System.out.println("奖");
        }else {
            System.out.println("无");
        }*/
       /* System.out.println("请输入考试成绩：");
        double a = input.nextDouble();
        System.out.println("请输入性别：");
        char b = input.next().charAt(0);
        String c = input.next();
        if (a>=60){
            if ((b == '男') && (c.equals("男"))){
                System.out.println("手枪");
            }else{
                System.out.println("娃娃");
            }
        }else {
            System.out.println("无");
        }*/
        System.out.println("请输入4位会员号：");
        int a = input.nextInt();
        int b = (int)(Math.random()*10);
        int c = a/100%10;
        if (b == c ){
            System.out.println(a+"号客户是幸运客户，获得奖品");
        }else{
            System.out.println(a+"号客户，谢谢");
        }

    }
}
