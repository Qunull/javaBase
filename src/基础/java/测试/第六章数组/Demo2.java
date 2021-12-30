package 基础.java.测试.第六章数组;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[]{8,4,2,1,23,344,12};
        System.out.println("请输入一个数：");
        int a = input.nextInt();
        boolean b = false;//默认不包含
        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]){
                System.out.println("包含");
                b = true;//标识符
                break;
            }
        }
        if (b == false){//(!b)
            System.out.println("不包含");
        }
    }
}
