package 基础.java.测试.第七章;

import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;//输入数的每一个值
        int num2 = 0;//位
        boolean b = true;
        System.out.println("请输入一个数：");
        int num = input.nextInt();
        int num3 = num;
        while (num > 0 ){
            num = num / 10 ;
            num2++;
        }
        int[] a = new int[num2];
        for (int i = 0; i < a.length; i++) {
            a[a.length-1-i] = num3 % 10;
            num3 = num3 / 10;
        }
        for (int i = 0; i < (a.length/2); i++) {
            if (a[i] != a[a.length-1-i]){
                b = false;
            }
        }
        if (b){
            System.out.println("是回文");
        }else {
            System.out.println("不是回文");
        }
    }
}
