package 基础.java.测试.第四章;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int a = 4;
        int b = 0;
        while (a <= 100){
            System.out.print(a+"\t");
            a += 4;
            b ++ ;
            if (b%5 == 0){
                System.out.println();//每六个一换行
            }
        }*/
        /*String s = "是";
        while (s.equals("是")){
            System.out.println("是否循环");
            s = input.next();
        }*/
       /* String a = "n";
        while (a.equals("n")) {
            System.out.println("上机");
            System.out.println("合格了么(y/n)");
            a = input.next();
        }
        System.out.println("通过");*/
        /*int a = 0;
        do {
            System.out.println(a);
            a++;
        }while (a > 10);*/
        /*String a = "n";
        do {
            System.out.println("上机");
            System.out.println("合格了么（y/n）");
            a = input.next();
        }while (a.equals("n"));
        System.out.println("通过");*/
        /*System.out.print("输入学生姓名：");
        String a = input.next();
        int i;
        double b = 0;
        for (i=1 ; i<=5 ; i++){
            System.out.print("请输入5门课程中的第"+i+"门课的成绩：");
            b += input.nextInt();
        }
        System.out.println(a+"的平均分为"+(b/5));*/
        /*System.out.println("请输入一个值");
        int num = input.nextInt();
        System.out.println("根据这个值可以输出以下加法表");
        for (int i = 0; i <= num;i++){
            System.out.println(i+"+"+(num-i)+"="+num);
        }*/
        System.out.print("输入学生姓名：");
        String a = input.next();
        int i ;
        double b = 0;
        int c = 0;
        for (i=1 ; i<=5 ; i++){
            System.out.print("请输入5门课程中的第"+i+"门课的成绩：");
           int d = input.nextInt();
            /* if (d>100||d<0){
                c = 1;
                System.out.println("您的输入有误，请重新输入！");
                break;
            }
            b += c;*/
            if (d<0||d>100){
                System.out.println("您的输入有误");
                break;
            }
        }
        if (i == 6){
            System.out.println(a + "的平均分为" + (b / 5));
        }
        /*if (c == 0) {
            System.out.println(a + "的平均分为" + (b / 5));
        }*/
    }
}
