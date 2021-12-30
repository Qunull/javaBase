package 基础.java.测试.第六章数组;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] nums = new int[4];
        System.out.println("请输入4个数字：");
        for(int i = 0;i < nums.length;i++){
            nums[i] = input.nextInt();
        }
        System.out.println("数组中的数为：");
        for (int i = 0;i < nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }
}
