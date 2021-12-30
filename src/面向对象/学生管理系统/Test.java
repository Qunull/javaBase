package 面向对象.学生管理系统;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student stu = new Student();
        Student.init();
        Mark mark = new Mark();
        Mark.init();
        Been been = new Been();
        while (true) {
            System.out.println("**********学生管理系统**********");
            System.out.println("1.查看所有学生");
            System.out.println("2.根椐姓名查看学生信息和成绩");
            System.out.println("3.根椐输入的分数线查看不及格的学生");
            System.out.println("4.修改学生的成绩");
            System.out.println("5.删除一个学生及成绩");
            System.out.println("6.增加学生及成绩");
            System.out.println("7.根椐总分排序");
            System.out.print("请选择：");
            int a = input.nextInt();
            switch (a){
                case 1:
                    System.out.println("查看所有学生");
                    stu.showAllInfo();
                    break;
                case 2:
                    System.out.println("根椐姓名查看学生信息和成绩");
                    System.out.print("输入你要查询的学生姓名：");
                    String name = input.next();
                    stu.getStudentByName(name);
                    break;
                case 3:
                    System.out.println("根椐输入的分数线查看不及格的学生");
                    System.out.print("输入笔试成绩：");
                    double write = input.nextDouble();
                    System.out.print("输入机试成绩：");
                    double lab = input.nextDouble();
                    stu.noPassStudent(write,lab);
                    break;
                case 4:
                    System.out.println("修改学生的成绩");

                    break;
                case 5:
                    System.out.println("删除一个学生及成绩");
                    System.out.println("请输入要删除的学生学号：");

                    break;
                case 6:
                    System.out.println("增加学生及成绩");

                    break;
                case 7:
                    System.out.println("根椐总分排序");
                    break;
                default:
                    System.out.println("输入错误！");
                    break;

            }
        }
    }
}
