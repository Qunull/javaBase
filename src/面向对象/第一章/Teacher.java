package 面向对象.第一章;

import java.util.Scanner;

public class Teacher {
    public String[] styNames = new String[30];

    public void addName(String name) {
        for (int i = 0; i < styNames.length; i++) {
            if (styNames[i] == null) {
                styNames[i] = name;
                break;
            }
        }
    }

    public void showNames() {
        for (int i = 0; i < styNames.length; i++) {
            if (styNames[i] != null) {
                System.out.println(styNames[i]);
            }
        }
    }

    public boolean queryName(int start, int end, String name) {
        boolean find = false;
        for (int i = (start - 1); i <= (end - 1); i++) {
            if (styNames[i].equals(name)) {
                find = true;
                break;
            }
        }
        return find;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Teacher a = new Teacher();
        while (true){
            System.out.println("输入姓名：");
            String name = input.next();
            if (name.equals("n")){
                System.out.println("退出");
                break;
            }
            a.addName(name);
        }
        a.showNames();
        System.out.println("请输入要查找的姓名：");
        String findName = input.next();
        System.out.println("请输入要查找的姓名的开始：");
        int start = input.nextInt();
        System.out.println("请输入要查找的姓名的结束：");
        int end = input.nextInt();
        boolean b = a.queryName(start,end,findName);
        if (b){
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
    }
}
