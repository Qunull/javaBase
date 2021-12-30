package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入秒数：");
        double a = input.nextDouble();
        if (a < 10){
            System.out.println("进入决赛");
        }else {
            System.out.println("没有进入决赛");
        }
    }
}
