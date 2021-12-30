package 集合.作业.Zuoye6;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private int id;
    private int grade;
    private int score;

    public Student(){
        this.id = (int)(Math.random()*29+1);
        this.grade = (int)(Math.random()*6+1);
        this.score = (int)(Math.random()*101);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Student){
            Student stu = (Student)obj;
            if (stu.id == this.id){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        while (true){
            boolean flag = false;
            Student stu = new Student();
            for (Student s : studentSet){
                if (s.equals(stu)){
                flag = true;
                break;
                }
            }
            if (flag == false){
                studentSet.add(stu);
            }
            if (studentSet.size() == 20){
                break;
            }
        }
        System.out.println("ID\t年级\t成绩");
        for (Student stu : studentSet){
            System.out.println(stu.id+"\t"+stu.grade+"\t"+stu.score);
        }
        int maxScore = 0;
        int minScore = 100;
        Student maxStu = null;
        Student minStu = null;
        for (Student stu : studentSet){
            if (stu.score > maxScore){
                maxStu = stu;
                maxScore = stu.score;
            }
            if (stu.score < minScore){
                minStu = stu;
                minScore = stu.score;
            }
        }
        System.out.println("---------------------");
        System.out.println("最高成绩学生：");
        System.out.println(maxStu.id+"\t"+maxStu.grade+"\t"+maxStu.score);
        System.out.println("最低成绩学生：");
        System.out.println(minStu.id+"\t"+minStu.grade+"\t"+minStu.score);
    }
}
