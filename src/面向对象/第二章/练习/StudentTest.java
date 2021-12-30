package 面向对象.第二章.练习;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] stus = new Student[5];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            System.out.print("第"+(i+1)+"位同学的姓名：");
            stus[i].name = input.next();
            System.out.print("第"+(i+1)+"位同学的成绩：");
            stus[i].score = input.nextDouble();
        }
        Teacher teacher = new Teacher();
        teacher.modifyScores(stus);
        System.out.println("***********");
        System.out.println("姓名\t\t成绩");

        for (Student sty : stus){
            System.out.println(sty.name+"\t\t"+sty.score);
        }
    }
}
