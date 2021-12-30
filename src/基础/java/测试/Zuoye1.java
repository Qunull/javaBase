package 基础.java.测试;

import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入青鸟游戏迷你平台");
        System.out.println("请选择您喜爱的游戏");
        System.out.println("************************************");
        System.out.println("\t\t1.斗地主");
        System.out.println("\t\t2.斗牛");
        System.out.println("\t\t3.泡泡龙");
        System.out.println("\t\t4.连连看");
        System.out.println("************************************");
        System.out.println("请选择，输入数字：");
        int a = input.nextInt();
        switch (a){
            case 1:
                System.out.println("您已进入斗地主房间！");
                break;
            case 2:
                System.out.println("您已进入斗牛房间！");
                break;
            case 3:
                System.out.println("您已进入泡泡龙房间！");
                break;
            case 4:
                System.out.println("您已进入连连看房间！");
                break;
            default:
                System.out.println("选择错误");
                break;
        }
    }
}
