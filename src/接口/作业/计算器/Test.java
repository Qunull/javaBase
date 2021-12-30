package 接口.作业.计算器;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UseComputer useComputer = new UseComputer();
        /*Computer computer = null;
        System.out.println("输入加减乘除：");
        String c = input.next();
        computer.equals(c);*/
        System.out.println("输入第一个数：");
        int a = input.nextInt();
        System.out.println("输入第二个数：");
        int b = input.nextInt();
        System.out.print("加法");
        useComputer.useCom(new jia(),a,b);
        System.out.print("减法");
        useComputer.useCom(new jian(),a,b);
        System.out.print("乘法");
        useComputer.useCom(new cheng(),a,b);
        System.out.print("除法");
        useComputer.useCom(new chu(),a,b);

    }
}
