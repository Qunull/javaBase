package 基础.java.测试.第三章.作业;

import java.util.Scanner;

public class Zuoye12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入QQ号：");
        int a = input.nextInt();
        System.out.println("请输入密码：");
        String b = input.next();
        if (a == 123456 && b.equals("qwerqwer")){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
