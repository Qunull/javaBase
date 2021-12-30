package 基础.java.测试.第六章;

import java.util.Scanner;

public class Zuoye {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String y = "y";
        String n = "n";
        String admin = "";
        String code = "";
        int a = 3;
        String n1 = "n";
        String vip = "n";
        int card = (int)(Math.random()*10000);
        do {
            System.out.println("*****欢进入奖客富翁系统*****");
            System.out.println("\t\t1.注册");
            System.out.println("\t\t2.登录");
            System.out.println("\t\t3.抽奖");
            System.out.println("**************************");
            System.out.print("请选择菜单：");
            int num = input.nextInt();
            switch (num){
                case 1:
                    System.out.println("[奖客富翁系统 > 注册]");
                    System.out.println("请填写个人注册信息：");
                    System.out.print("用户名：");
                    admin = input.next();
                    System.out.print("密码:");
                    code = input.next();
                    System.out.println("注册成功，请记好您的会员卡号");
                    System.out.println("用户名\t密码\t\t会员卡号");
                    System.out.println(admin+"\t\t"+code+"\t\t"+card);
                    n = "y";
                    System.out.println("继续吗？(y/n)");
                    y = input.next();
                    break;
                case 2:
                    System.out.println("[奖客富翁系统 > 登录]");
                    if (n.equals("y")){
                        System.out.print("请输入用户名：");
                        String admin1 = input.next();
                        System.out.print("请输入密码：");
                        String code1 = input.next();
                        if ((admin1.equals(admin)) && (code1.equals(code))){
                            System.out.println("欢迎您："+ admin);
                            n1 = "y";
                        }else {
                            System.out.println("您还有"+(a-1)+"次机会：");
                            a -= 1;
                            if (a == 0){
                                System.out.println("登陆失败，请重新登录！");
                                y = "n";
                                break;
                            }
                        }
                    }else {
                        System.out.println("请先注册");
                    }
                    System.out.println("继续吗？(y/n)");
                    y = input.next();
                    break;
                case 3:
                    if (n1.equals("y")) {
                        System.out.println("[奖客富翁系统 > 抽奖]");
                        System.out.print("请输入您的卡号:");
                        int card1 = input.nextInt();
                        if (card == card1){
                            for (int i = 1;i <= 4;i++){
                                int card2 = (int)(Math.random()*10000);
                                System.out.println("本日的幸运数字："+card2);
                                if (card2 == card){
                                    vip = "y";
                                }
                            }
                            if (vip.equals("y")){
                                System.out.println("您是幸运会员！！！");
                            }else {
                                System.out.println("抱歉您不是幸运会员！");
                            }
                        }else {
                            System.out.println("您的卡号输入有误");
                        }
                        System.out.println("继续吗？(y/n)");
                        y = input.next();
                        break;
                    }else {
                        System.out.println("请先登录！！！");
                        break;
                    }
                default:
                    System.out.println("输入错误");
                    System.out.println("继续吗？(y/n)");
                    y = input.next();
                    break;
            }
            if (y.equals("n")){
                System.out.println("系统退出，谢谢使用");
                y = "n";
                break;
            }
        }while (y.equals("y"));

    }
}
