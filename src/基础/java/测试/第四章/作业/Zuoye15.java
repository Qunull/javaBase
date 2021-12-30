package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        while (a < 3){
            System.out.print("请输入第"+(a+1)+"个姓名：");
            String b = input.next();
            a++;
        }
    }
}
