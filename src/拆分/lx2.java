package 拆分;

import java.util.ArrayList;
import java.util.Scanner;

public class lx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        StringBuffer sb = new StringBuffer(input.nextLine());
        for (int i = sb.length() - 3; i > 0; i = i - 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
