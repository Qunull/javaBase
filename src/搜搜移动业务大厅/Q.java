package 搜搜移动业务大厅;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        W w = new W();
        boolean zhuce = false;
        System.out.println("**********欢迎使用搜搜移动业务大厅**********");
        boolean a = true;
        while (a) {
            System.out.println("1. 用户登录 2.用户注册 3.使用搜搜 4.话费充值 5.资费说明 6.退出系统");
            System.out.print("请选择：");
            int b = input.nextInt();
            switch (b) {
                case 1:
                    if (zhuce) {
                        System.out.println("用户登录————>");
                        w.login();
                    } else {
                        System.out.println("请先注册！");
                    }
                    break;
                case 2:
                    System.out.println("用户注册————>");
                    w.enroll();
                    zhuce = true;
                    break;
                case 3:
                    if (zhuce) {
                        System.out.println("使用搜搜————>");
                        w.use();
                    } else {
                        System.out.println("请先注册！");
                    }
                    break;
                case 4:
                    if (zhuce) {
                        System.out.println("话费充值————>");
                        w.recharge();
                    } else {
                        System.out.println("请先注册！");
                    }
                    break;
                case 5:
                    if (zhuce) {
                        System.out.println("资费说明————>");
                        w.illustrate();
                    } else {
                        System.out.println("请先注册！");
                    }
                    break;
                case 6:
                    System.out.println("退出系统————>");
                    System.out.println("谢谢使用！");
                    a = false;
                    break;
            }
        }
    }
}
