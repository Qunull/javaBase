package 面向对象.第一章.作业;

import java.util.Scanner;

public class Zuoye1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "y";
        do {
            System.out.println("请输入姓名：");
            Zuoye1 student = new Zuoye1();
            student.name = input.next();
            System.out.println("请输入年龄：");
            student.age = input.nextInt();
            if (student.age < 16){
                System.out.println("输入错误！");
                break;
            }
            System.out.println("请输入性别：");
            student.sex = input.next().charAt(0);
            student.des();
            System.out.println("是否继续（y/n）");
            a = input.next();
        }while (a.equals("y"));
    }
}
