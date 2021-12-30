package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] people = new String[3];
        for (int i = 0; i < people.length; i++) {
            System.out.print("请输入第"+(i+1)+"个人的名字：");
            people[i] = input.next();
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
