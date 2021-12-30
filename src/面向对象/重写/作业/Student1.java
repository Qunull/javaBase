package 面向对象.重写.作业;

public class Student1 extends Person1{
    private String classroom;

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        String a = "姓名："+super.getName()+"\n"+ "地址："+super.getAddress()+"\n"+ "电话："+
        super.getNumb()+"\n"+ "邮箱："+super.getEmile()+"\n"+ "年级："+classroom;
        return a;
    }

}
