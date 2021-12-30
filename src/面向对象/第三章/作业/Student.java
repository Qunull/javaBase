package 面向对象.第三章.作业;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16) {
            this.age = age;
        }else {
            System.out.println("输入错误，最小16岁");
            this.age = 16;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("输入学生姓名：");
        student.setName(input.next());
        System.out.println("输入学生年龄：");
        student.setAge(input.nextInt());
        System.out.println("输入学生性别：");
        char sex = input.next().charAt(0);
        student.setSex(sex);
        System.out.println("学生姓名："+student.getName()+",学生年龄："+student.getAge()+",学生性别："+student.getSex());
    }
}
