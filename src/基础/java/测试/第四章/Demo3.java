package 基础.java.测试.第四章;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int a = 0;
        while (i <= 100){
            System.out.print("王大头是我儿，我是大头爹\t");
            i++;
            a++;
            if (a%3 == 0){
                System.out.println();
            }
        }
    }
}
