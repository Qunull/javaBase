package 面向对象.重写;

public class Student {
    public int num;
    public String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Student){
            Student stu = (Student) obj;
            if (this.num == stu.num && this.name.equals(stu.name)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(1,"张三");
        Student stu2 = new Student(1,"张三");
        System.out.println(stu1.equals(stu2));

    }
}
