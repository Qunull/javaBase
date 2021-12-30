package 面向对象.第三章.作业2;

import java.util.Scanner;

public class Admin {
    private String admin = "123";
    private String password = "111";

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        System.out.print("请输入用户名：");
        String a = input.next();
        System.out.print("请输入密  码：");
        String b = input.next();
        if (admin.getAdmin().equals(a) && admin.password.equals(b)){
            System.out.println("登陆成功！");
        }else {
            System.out.println("用户名或者密码输入错误！");
        }
    }
}
