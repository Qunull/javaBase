package 集合.作业.Zuoye4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Worker {
    private String name;
    private int age;
    private int money;
    public void worlk(){
        System.out.println(name);
    }
    public Worker(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Worker() {

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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        list.add(new Worker("zhang3",18,3300));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));
        list.add(1,new Worker("zhao6",24,3300));
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名："+list.get(i).getName()+",年龄："+list.get(i).getAge()+",工资：："+list.get(i).getMoney());
        }
        Iterator<Worker> it = list.iterator();
        for (Worker worker : list){
            worker.worlk();
        }
    }
}
