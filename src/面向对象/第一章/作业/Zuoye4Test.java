package 面向对象.第一章.作业;

import java.util.Scanner;

public class Zuoye4Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zuoye4 user = new Zuoye4();
        System.out.print("请输入用户名：");
        String userName1 = input.next();
        System.out.print("请输入密码：");
        int passWord1 = input.nextInt();
        if (userName1.equals(user.userName ) && passWord1 == user.passWord){
            System.out.print("请输入新密码：");
            user.newPassWord = input.nextInt();
            user.show();
        }else {
            System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
        }
    }
}
