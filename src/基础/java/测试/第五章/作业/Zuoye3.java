package 基础.java.测试.第五章.作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "y";
            System.out.println("************************************************");
            System.out.println("请选择购买的商品编号：");
            System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
            System.out.println("************************************************");
            int b;
            double c;
            double sum = 0;
            do {
                System.out.println("请输入商品编号：");
                b = input.nextInt();
                switch (b){
                    case 1:
                        b = 245;
                        System.out.println("T恤\t￥245.0");
                        break;
                    case 2:
                        b = 570;
                        System.out.println("网球鞋\t￥570.0");
                        break;
                    case 3:
                        b = 320;
                        System.out.println("网球拍\t￥320.0");
                        break;
                    default:
                        System.out.println("输入错误");
                }
                System.out.println("请输入购买数量：");
                c = input.nextDouble();
                System.out.println("合计："+(b*c));
                System.out.println("是否继续（y/n）");
                a = input.next();
                sum += (b*c);
            }while (a.equals("y"));
        System.out.println("折扣：0.8");
        System.out.println("应付金额："+(sum*0.8));
        System.out.print("实付金额：");
        double d = input.nextDouble();
        if (d < (sum*0.8)){
            System.out.print("您的金额不足");
        }else {
            System.out.print("找零："+(d-(sum*0.8)));
        }
    }
}
