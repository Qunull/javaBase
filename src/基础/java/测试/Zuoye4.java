package 基础.java.测试;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.println("青鸟迷你游戏平台 > 游戏点击率");
        for (int a = 1 ; a <= 4 ; a++){
            System.out.print("请输入第"+a+"个游戏的点击率：");
            int b = input.nextInt();
            if (b >= 100){
                sum++;
            }
        }
        System.out.println("点击率大于100的游戏是："+sum);
        System.out.println("点击率大于100的游戏所占的比例为："+(sum/4)*100+"%");
    }
}
