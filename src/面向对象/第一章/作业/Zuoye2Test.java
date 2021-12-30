package 面向对象.第一章.作业;

import java.util.Scanner;

public class Zuoye2Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zuoye2 count = new Zuoye2();
        System.out.print("请输入第一个数:");
        count.num = input.nextInt();
        System.out.print("请输入第二个数:");
        count.num1 = input.nextInt();
        System.out.print("请输入第三个数:");
        count.num2 = input.nextInt();
        count.count();
    }
}
