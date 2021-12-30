package 十月月考;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个4位数：");//1234
        int a = input.nextInt();
        int[] b = new int[4];
        for (int i = 0; i < b.length; i++) {
            b[i] = a % 10;
            a = a / 10;
        }
        //4321
        for (int i = 0; i < b.length; i++) {
            b[i] = (b[i]+5)%10;
            System.out.print("加密后："+b[i]);
        }
    }
}
