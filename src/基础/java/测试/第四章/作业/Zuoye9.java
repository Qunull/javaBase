package 基础.java.测试.第四章.作业;

import java.util.Scanner;

public class Zuoye9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎光临中国移动");
        System.out.println("请按键：1.充话费 2.查业务 0.人工服务");
        int a = input.nextInt();
        switch (a){
            case 1:
                System.out.println("请输入要充值的花费：");
                int b = input.nextInt();
                System.out.println("请输入要充值的手机号：");
                long c = input.nextLong();
                System.out.println("已为"+c+"充值"+b+"元成功");
                break;
            case 2:
                System.out.println("查业务完毕");
                break;
            case 0:
                System.out.println("请问有什么需要帮助？");
                String d = input.next();
                System.out.println(d+"这个问题已经解决");
                break;
            default:
                System.out.println("输入有误");
        }
        System.out.println("谢谢使用");
    }
}
