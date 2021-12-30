package 基础.java.测试.第七章;

import java.util.Scanner;

public class DVD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DVD 名称  是否可借  借出日期  借出次数
        //最多存六张
        //循环结束条件 name[i] == null
        //存6个显示满 dvd默认可借
        //删除 给出提示，不存在给出提示
        //日期在 1-31
        String[] name = new String[6];//名称数组
        String[] borrow = new String[6];//是否可借数组
        String[] date = new String[6];//日期数组
        int[] time = new int[6];//借出次数

        //默认存入数据
        name[0] = "罗马假日";
        borrow[0] = "已借出";
        date[0] = "1日";
        time[0] = 15;

        name[1] = "风声鹤唳";
        borrow[1] = "可  借";
        date[1] = "暂无";
        time[1] = 12;

        name[2] = "浪漫满屋";
        borrow[2] = "可  借";
        date[2] = "暂无";
        time[2] = 30;

        boolean b = true;//while标识符
        int date1 = 0;//借书初始变量
        String name2 = "";//初始化删除变量

        System.out.println("欢迎使用迷你DVD管理器");
        do {
            System.out.println("----------------------------");
            System.out.println("1.新增DVD");
            System.out.println("2.查看DVD");
            System.out.println("3.删除DVD");
            System.out.println("4.借出DVD");
            System.out.println("5.归还DVD");
            System.out.println("6.退出DVD");
            System.out.println("----------------------------");
            System.out.print("请选择：");
            int a = input.nextInt();
            switch (a) {
                case 1:
                    System.out.println("-->新增DVD");
                    System.out.println("请输入DVD名称：");
                    String name1 = input.next();
                    boolean f = false;//标识符
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null && name1.equals(name[i])){
                            f = true;
                            System.out.println("您输入的DVD名字已存在！");
                            break;
                        }
                    }
                    if (f == false) {
                        for (int i = 0; i < name.length; i++) {
                            if (name[i] == null) {
                                name[i] = name1;
                                borrow[i] = "可  借";
                                date[i] = "暂无";
                                time[i] = 0;
                                System.out.println("新增《" + name1 + "》成功！");
                                break;
                            } else if (name[5] != null) {
                                System.out.println("货架已满，新增失败！");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("-->查看DVD");
                    System.out.println("序号\t\t状态\t\t\t名称\t\t\t借出日期\t\t\t借出次数");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null) {
                            System.out.println((i + 1) + "\t\t" + borrow[i] + "\t\t" + name[i] + "\t\t\t" + date[i] + "\t\t\t" + time[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("-->删除DVD");
                    System.out.println("序号\t\t状态\t\t\t名称\t\t\t借出日期\t\t\t借出次数");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null) {
                            System.out.println((i + 1) + "\t\t" + borrow[i] + "\t\t" + name[i] + "\t\t\t" + date[i] + "\t\t\t" + time[i]);
                        }
                    }
                    System.out.print("请选择要删除的序号：");
                    int delet = input.nextInt();
                    name2 = name[delet - 1];
                    if (name[delet - 1] != null && borrow[delet - 1].equals("可  借")) {
                        name[delet - 1] = null;
                        for (int i = 0; i < name.length - 1; i++) {
                            if (name[i] == null) {
                                name[i] = name[i + 1];
                                borrow[i] = borrow[i + 1];
                                date[i] = date[i + 1];
                                time[i] = time[i + 1];
                                name[i + 1] = null;
                                borrow[i + 1] = "";
                                date[i + 1] = "";
                                time[i + 1] = 0;
                            }
                        }
                        System.out.println("删除《" + name2 + "》成功！");
                    } else if (name[delet - 1] == null) {
                        System.out.println("删除失败，该DVD不存在");
                    } else if (borrow[delet - 1].equals("已借出")) {
                        System.out.println("删除失败，该DVD尚未归还");
                    }
                    break;
                case 4:
                    System.out.println("-->借出DVD");
                    System.out.println("序号\t\t状态\t\t\t名称\t\t\t借出日期\t\t\t借出次数");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null) {
                            System.out.println((i + 1) + "\t\t" + borrow[i] + "\t\t" + name[i] + "\t\t\t" + date[i] + "\t\t\t" + time[i]);
                        }
                    }
                    System.out.print("请选择要借的DVD序号：");
                    int bor = input.nextInt();
                    if (bor > name.length || bor < 0 || name[bor-1] == null){
                        System.out.println("您输入的编号不存在！");
                    }else if ( borrow[bor - 1].equals("已借出")){
                        System.out.println("您输入得编号已借出！");
                    }else if (borrow[bor - 1].equals("可  借") && name[bor - 1] != null){
                        borrow[bor - 1] = "已借出";
                        System.out.print("请输入您借的日期：");
                        date1 = input.nextInt();
                        date[bor - 1] = date1 + "日";
                        time[bor - 1] = time[bor - 1] + 1;
                        System.out.println("借出《" + name[bor - 1] + "》成功");
                    }
                    break;
                case 5:
                    System.out.println("-->归还DVD");
                    System.out.println("序号\t\t状态\t\t\t名称\t\t\t借出日期\t\t\t借出次数");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null) {
                            System.out.println((i + 1) + "\t\t" + borrow[i] + "\t\t" + name[i] + "\t\t\t" + date[i] + "\t\t\t" + time[i]);
                        }
                    }
                    System.out.print("请输入要归还的DVD：");
                    int ret = input.nextInt();
                    boolean p = true;
                    if (ret > name.length || ret < 0 || (name[ret-1] == null)){
                        p = false;
                        System.out.println("您输入的编号不存在或者未借出！");
                        break;
                    }
                    if (p == true) {
                        if (borrow[ret - 1].equals("已借出")) {
                            System.out.print("请输入您的归还日期：");
                            int date2 = input.nextInt();
                            if (date2 > date1 && date2 < 31) {
                                borrow[ret - 1] = "可  借";
                                date[ret - 1] = "暂无";
                                System.out.println("归还《" + name[ret - 1] + "》成功！");
                                int sum = (date2 - date1) * 2;
                                System.out.println("您需要支付：" + sum + "元");
                            } else {
                                System.out.println("还书要大于借书日期，并且不能大于31日");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("-->退出DVD");
                    System.out.println("谢谢使用！");
                    b = false;
                    break;
                default:
                    System.out.println("选择错误");
                    break;
            }
            if (a != 6) {
                System.out.print("输入0返回：");
                int q = input.nextInt();
            }
        } while (b == true);
    }
}