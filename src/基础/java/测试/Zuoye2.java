package 基础.java.测试;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("青鸟迷你游戏平台 > 游戏晋级");
        for (int a = 1;a <= 5;a++){
            System.out.print("您正在玩第"+a+"局，成绩为：");
            int b = input.nextInt();
            if (b >= 80){
                sum ++;
            }
            System.out.println("继续玩下一局吗?(yes/no)");
            String c = input.next();
            if (c.equals("no")){
                System.out.println("您已中途退出游戏。");
                break;
            }
        }
        System.out.println("游戏结束");
        if(sum >= 4){
            System.out.println("恭喜！通过一级");
        }else if (sum >= 3){
            System.out.println("恭喜！通过二级");
        }else {
            System.out.println("对不起，您未能晋级，继续加油啊！");
        }
    }
}
