package 十月月考;

import com.sun.javafx.scene.input.InputEventUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int num;
    private int Math;
    private int English;
    private int Java;

    public Student() {
    }

    public Student(int num, int math, int english, int java) {
        this.num = num;
        Math = math;
        English = english;
        Java = java;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getJava() {
        return Java;
    }

    public void setJava(int java) {
        Java = java;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        double a = 0;
        double b = 0;
        double c = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第"+(i+1)+"名学生的学号:");
            int num = input.nextInt();
            System.out.print("请输入第"+(i+1)+"名学生的数学成绩:");
            int math = input.nextInt();
            a += math;
            System.out.print("请输入第"+(i+1)+"名学生的英语成绩:");
            int english = input.nextInt();
            b += english;
            System.out.print("请输入第"+(i+1)+"名学生的Java成绩:");
            int java = input.nextInt();
            c += java;
            students.add(new Student(num,math,english,java));
        }
        BufferedWriter bw = null;
        FileWriter fw = null;
        OutputStream os = null;
        try {
            fw = new FileWriter("file/stu,txt");
            bw = new BufferedWriter(fw);
            for (int i = 0; i < students.size(); i++) {
                bw.write(String.valueOf(students.get(i).num)+"\t"+(students.get(i).getMath())+"\t"+(students.get(i).getEnglish())+"\t"+(students.get(i).getJava())+"\t"+"\n");
            }
            bw.write("数学平均成绩："+String.valueOf(a)+"\n");
            bw.write("英语平均成绩："+String.valueOf(b)+"\n");
            bw.write("Java平均成绩："+String.valueOf(c)+"\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
