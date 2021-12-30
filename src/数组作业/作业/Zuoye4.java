package 数组作业.作业;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("请输入第一组中第"+(i+1)+"个数：");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("请输入第一组中第"+(i+1)+"个数：");
            b[i] = input.nextInt();
        }
       System.arraycopy(a,0,c,0,a.length);
       System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        for (int d : c){
            System.out.println(d);
        }
    }
}
