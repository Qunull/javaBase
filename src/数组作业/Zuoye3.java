package 数组作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入想要的行数：");
        int a = input.nextInt();
        int arr[][] = new int[a][];
        for (int i = 0; i <a; i++) {
            arr[i] = new int[i+1];
            for (int j = 0; j <a-1; j++) {
                System.out.print("");
            }
            for (int j = 0; j <=i ; j++) {
                if (j == 0 || j == i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
