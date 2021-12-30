package 面向对象.第三章.作业;

import java.util.Scanner;

public class Man {
    private String name;
    private int age;
    private String nationality;

    public void check(Man[] ps){
        for (Man p : ps){
            if (p.nationality.equals("中国")){
                System.out.println("姓名："+p.name+"\t年龄："+p.age+"\t国籍："+p.nationality);
            }
        }
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
        if (age > 16) {
            this.age = age;
        }else {
            this.age = 18;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public static void main(String[] args) {
        Man[] ps = new Man[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < ps.length; i++) {
            Man p = new Man();
            System.out.println("输入第"+(i+1)+"个人的姓名：");
            p.setName(input.next());
            System.out.println("输入第"+(i+1)+"个人的年龄：");
            p.setAge(input.nextInt());
            System.out.println("输入第"+(i+1)+"个人的国籍：");
            p.setNationality(input.next());

            ps[i] = p;
        }
        Man a = new Man();
        a.check(ps);
    }
}
