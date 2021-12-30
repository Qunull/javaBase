package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的秒数：");
        int a = input.nextInt();
        if (a <= 10){
            System.out.println("请输入您的性别：");
            char b = input.next().charAt(0);
            if (b == '男'){
                System.out.println("恭喜进入男子组");
            }else {
                System.out.println("恭喜进入女子组");
            }
        }else {
            System.out.println("您没有进入决赛");
        }
    }
}
