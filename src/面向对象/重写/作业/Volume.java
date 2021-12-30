package 面向对象.重写.作业;

import java.util.Scanner;

public class Volume extends Rectangle{
    private int high;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int info(int length, int wide,int high) {
        int a = length*wide*high;
        return a ;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Volume v = new Volume();
        System.out.print("输入长方形的长：");
        int a = input.nextInt();
        System.out.print("输入长方形的宽：");
        int b = input.nextInt();
        System.out.print("输入长方形的高：");
        int c = input.nextInt();
        System.out.println("长方形的面积："+v.area(a,b));
        System.out.println("长方形的体积："+v.info(a,b,c));
    }
}
