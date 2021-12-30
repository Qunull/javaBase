package 基础.java.测试;

import java.util.Scanner;

public class Zuoye8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int a = 1 ; a <= 4;a++){
            for (int b = 1;b <= 4;b++){
                for (int c = 1;c <= 4;c++){
                    for (int d = 1;d <= 4;d++){
                        if (a==b||a==c||a==d||b==c||b==d||c==d){
                            continue;
                        }
                        System.out.println(a+""+b+""+c);
                        System.out.println(a+""+b+""+d);
                        System.out.println(b+""+c+""+d);
                    }
                }
            }
        }
    }
}
