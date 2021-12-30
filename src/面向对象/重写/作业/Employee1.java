package 面向对象.重写.作业;

public class Employee1 extends Person1{
    private String room;
    private int money;
    private String date;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "姓名："+super.getName()+"\n"+ "地址："+super.getAddress()+"\n"+
                "电话："+super.getNumb()+"\n"+ "邮箱："+super.getEmile()+"\n"+ "办公室："+room+"\n"+ "工资："+money+"\n"+ "受聘日期："+date;
    }
}
