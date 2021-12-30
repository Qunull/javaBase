package 面向对象.学生管理系统;

import java.util.ArrayList;

public class Student {
    private String name;
    private int num;
    private String sex;
    Mark mark = new Mark();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student() {
    }

    static Student[] students = new Student[20];

    public Student(int num,String name,String sex){
        this.num = num;
        this.name = name;
        this.sex = sex;
    }
    static public void init(){
        students[0] = new Student(1001,"王以","女");
        students[1] = new Student(1002,"王尔","女");
        students[2] = new Student(1003,"王散","男");
        students[3] = new Student(1004,"王思","女");
        students[4] = new Student(1005,"王无","男");
        students[5] = new Student(1006,"王柳","女");
        students[6] = new Student(1007,"王齐","男");
        students[7] = new Student(1008,"王疤","男");
        students[8] = new Student(1009,"王久","女");
        students[9] = new Student(1010,"王时","男");

    }
    public void showAllInfo(){
        for (Student stu : students){
            if (stu != null){
                System.out.println("学号：" + stu.getNum() + "\t姓名：" + stu.getName() + "\t性别：" + stu.getSex());
            }
        }
    }
    public void getStudentByName(String name){
        for (Student stu : students){
            if (stu != null && stu.getName().equals(name)){
                System.out.println("学号：" + stu.getNum() + "\t姓名：" + stu.getName() + "\t性别：" + stu.getSex()+"\t"+mark.getMarkByNo(stu.getNum()));
            }
        }
    }
    public void noPassStudent(double written, double lab){
        int[] stuNos = mark.noPassStuNo(written,lab);
        for (int no : stuNos){
            for (Student stu : students){
                if (stu != null && stu.getNum() == no){
                    System.out.println("学号：" + stu.getNum() + "\t姓名：" + stu.getName() + "\t性别：" + stu.getSex()+"\t"+mark.getMarkByNo(stu.getNum()));
                }
            }
        }
    }
}
