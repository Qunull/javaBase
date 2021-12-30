package 基础.java.测试.第六章.作业;

import java.util.Scanner;

public class Zuoye5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int d = 0;
        for (int a = 1;a<=3;a++){
            System.out.println("请输入第"+a+"个人所购的三件商品的价格");
            for (int b = 1;b<=3;b++){
                double c = input.nextDouble();
                sum += c;
                if (c <= 300){
                   continue;
                }else {
                    d++;
                }
            }
            System.out.println("第"+a+"个人共有"+d+"件商品享受8折优惠！");
            d = 0;
        }
    }
}
