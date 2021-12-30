package 集合.作业.Zuoye5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Setdemo {
    public static void main(String[] args) {
        Set<Double> list = new HashSet<>();
        while (true){
            double a = Math.random() * 100;
            System.out.println(a);
            list.add(a);
            if (list.size() == 10){
                break;
            }
        }
        Double[] nums = new Double[10];
        list.toArray(nums);
        double max = nums[0];
        double min = nums[0];
        for (int i = 1; i < list.size(); i++) {
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("最大数："+max);
        System.out.println("最小数："+min);
    }
}
