package 面向对象.继承.作业;

public class StudentFromHuman extends Human{
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void showInfo(){
        System.out.println("姓名："+super.getName()+" 性别："+sex+" 年龄："+super.getAge());
    }

    public static void main(String[] args) {
        StudentFromHuman s = new StudentFromHuman();
        s.setName("颤三");
        s.setAge(20);
        s.setSex("男");
        s.showInfo();
    }
}
