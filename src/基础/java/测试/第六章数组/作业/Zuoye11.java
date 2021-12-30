package 基础.java.测试.第六章数组.作业;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[6];//存放红球数组
        int blue = (int)(Math.random()*33+1);//蓝球随机数
        System.out.print("红球：");
        for (int i = 0; i < a.length; i++) {
            boolean b = true;//标识符
            int red = (int)(Math.random()*33+1);//生成随机红球
            for (int j = 0; j < a.length; j++) {
                if (red == a[j]){//每次生成的和数组中的进行对比
                    i--;//如果一样，外循环减一，重新生成
                    b = false;//标识符
                    break;
                }
            }
            if (b == true){//标识符为ture存入数组
                a[i]=red;
            }
        }
        Arrays.sort(a);//升序排序
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.println("蓝球："+blue);
    }
}
