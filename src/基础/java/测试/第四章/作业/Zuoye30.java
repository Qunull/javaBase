package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double a = input.nextDouble();
        System.out.println("请输入第二个数：");
        double b = input.nextDouble();
        System.out.println("请选择想要的操作：1.加法 2.减法 3.乘法 4.除法");
        int c = input.nextInt();
        switch (c){
            case 1:
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case 4:
                if (b != 0){
                    System.out.println(a+"/"+b+"="+(a/b));
                }else {
                    System.out.println("除数不能为0");
                }
                break;
            default:
                System.out.println("您的输入有误");
        }
    }
}
