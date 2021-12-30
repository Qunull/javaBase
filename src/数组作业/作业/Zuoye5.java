package 数组作业.作业;

import java.util.Arrays;

public class Zuoye5 {
    public static void main(String[] args) {
        int[] a = {-99,-9,32,77,-99,-24,14,0,-99,-99};
        int min = 100;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (min == a[i]){
                c = i;
                break;
            }
        }
        System.out.println("最小值位置："+c);
    }
}
