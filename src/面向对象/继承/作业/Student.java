package 面向对象.继承.作业;


import java.util.Scanner;

public class Student extends Person{
    private int num;
    private String academic;
    private int age;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("学号："+num+" 专业："+academic+" 年龄："+(2021-super.getBirthDate()));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("姓名：");
        student.setName(input.next());
        System.out.print("性别：");
        student.setGender(input.next());
        System.out.print("出生年份：");
        student.setBirthDate(input.nextInt());
        student.disPlay();
        System.out.print("请输入修改的姓名：");
        String name = input.next();
        System.out.print("请输入修改的性别：");
        String gender = input.next();
        System.out.print("请输入修改的出生年份：");
        int birthDate = input.nextInt();
        student.revise(name,gender,birthDate);
        student.disPlay();
        System.out.println("请输入学号：");
        student.setNum(input.nextInt());
        System.out.println("请输入专业：");
        student.setAcademic(input.next());
        student.show();

    }
}
