package 面向对象.第三章.作业1;

import java.util.Scanner;

public class DataSort {
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]){
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static String sort(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择输入的数据类型1.整形 2.字符串");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println("输入数组的长度：");
                int[] nums = new int[input.nextInt()];
                for (int i = 0; i < nums.length; i++) {
                    System.out.println("请输入第"+(i+1)+"个整数：");
                    nums[i] = input.nextInt();
                }
                break;
            case 2:
                System.out.println("请输入字符串的内容：");

        }
    }
}
