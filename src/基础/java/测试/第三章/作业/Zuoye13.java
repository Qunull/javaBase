package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("三角形任意两边之和大于第三边");
        System.out.println("请输入第一条边长度：");
        int a = input.nextInt();
        System.out.println("请输入第二条边长度：");
        int b = input.nextInt();
        System.out.println("请输入第三条边长度：");
        int c = input.nextInt();
        if (a+b>c&&a+c>b&&b+c>a){
            System.out.println("是三角形");
        }else {
            System.out.println("不是三角形");
        }
    }
}
