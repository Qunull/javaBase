package 面向对象.重写.作业;

public class Staff extends Employee1{
    private String time;
    private String title;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "姓名：" + super.getName()+"\n"+"地址：" + super.getAddress()+"\n"+"电话：" + super.getNumb()
                +"\n"+"邮箱：" + super.getEmile()+"\n"+"办公室：" + super.getRoom()+"\n"+"工资：" + super.getMoney()
                +"\n"+"受聘日期：" + super.getDate()+"\n"+"工作时间："+time+"\n"+"职务称号："+title;
    }
}
