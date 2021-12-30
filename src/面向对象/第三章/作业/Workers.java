package 面向对象.第三章.作业;

import java.util.Scanner;

public class Workers {
    private int num;
    private String name;
    private String post;
    private int money;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Workers() {
    }
    public String getInfo(){
        return ("编号："+getNum()+",姓名："+getName()+
                ",职位："+getPost()+",工资："+getMoney());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Workers workers = new Workers();
        System.out.println("请输入编号：");
        workers.setNum(input.nextInt());
        System.out.println("请输入姓名：");
        workers.setName(input.next());
        System.out.println("请输入职位：");
        workers.setPost(input.next());
        System.out.println("请输入工资：");
        workers.setMoney(input.nextInt());
        System.out.println(workers.getInfo());
    }
}
