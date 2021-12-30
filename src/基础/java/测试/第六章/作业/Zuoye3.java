package 基础.java.测试.第六章.作业;

import java.util.Scanner;

public class Zuoye3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int q = 0;
        int p = 0;
        for (int a = 1; a <= 3; a++){
            System.out.println("请输入第"+a+"个班的成绩");
            for (int b = 1; b <= 4; b++){
                System.out.print("请输入第"+b+"个学员的成绩：");
                int c = input.nextInt();
                if (c < 85){
                    continue;
                }else {
                    sum += c;
                    q ++;
                    p ++;
                }
            }
            if (q == 0){
                System.out.println("第"+a+"个班级参赛学院平均分为：0");
            }else {
                System.out.println("第" + a + "个班级参赛学院平均分为：" + (sum / q));
            }
            sum = 0;
            q = 0;
        }
        System.out.println("成绩85分以上的学员共有"+p+"人");
    }
}
