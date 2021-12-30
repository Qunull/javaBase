package 集合.作业.Zuoye2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private int score;
    private String classNum;

    public Student(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public Student() {
    }

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
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tom",18,100,"class05"));
        list.add(new Student("Jerry",22,70,"class04"));
        list.add(new Student("Owen",25,90,"class05"));
        list.add(new Student("Jim",30,80,"class05"));
        list.add(new Student("Steve",28,66,"class06"));
        list.add(new Student("Kevin",24,100,"class04"));
        double age = 0;
        double score = 0;
        for (int i = 0; i < list.size(); i++) {
            age += list.get(i).getAge();
            score += list.get(i).getScore();
        }
        System.out.println("平均年龄："+age / list.size());
        System.out.println("平均分数："+score / list.size());
    }
}
