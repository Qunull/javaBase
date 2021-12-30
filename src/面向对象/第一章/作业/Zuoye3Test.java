package 面向对象.第一章.作业;

public class Zuoye3Test {
    public static void main(String[] args) {
        Zuoye3 student = new Zuoye3();
        student.name = "张浩";
        student.age = 10;
        student.grade = "S1班";
        student.hobby = "篮球";
        student.show();
        System.out.println();
        Zuoye3Teacher teacher = new Zuoye3Teacher();
        teacher.name = "王老师";
        teacher.lessons = "计算机";
        teacher.major = "使用Java语言理解程序逻辑";
        teacher.age = 5;
        teacher.show();
    }
}
