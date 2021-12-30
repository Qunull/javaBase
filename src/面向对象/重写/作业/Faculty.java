package 面向对象.重写.作业;

public class Faculty extends Employee1{
    private String time;
    private String level;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "姓名："+super.getName()+"\n"+"地址："+super.getAddress()+"\n"+"电话："+super.getNumb()
                +"\n"+"邮箱："+super.getEmile()+"\n"+"办公室："+super.getRoom()+"\n"+"工资："+super.getMoney()
                +"\n"+"受聘日期："+super.getDate()+"\n"+"办公时间："+time+"\n"+"级别："+level;
    }
}
