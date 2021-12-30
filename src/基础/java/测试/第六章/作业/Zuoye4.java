package 基础.java.测试.第六章.作业;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String b = "n";
        int c = 0;
        int d = 0;
        for (int a = 1;a <= 5;a++){
            System.out.println("欢迎光临第"+a+"家专卖店");
            while (b.equals("n")) {
                System.out.println("要离开么(y/n)");
                b = input.next();
                if (b.equals("n")) {
                    System.out.println("买了一件衣服");
                    c++;
                    d++;
                    if (c>2){
                        System.out.println("本店购买衣服超过上限");
                        c = 0;
                        break;
                    }
                }else {
                    System.out.println("离店结账");
                    break;
                }
            }
            b = "n";
        }
        System.out.println("总共买了"+d+"件衣服");
    }
}
