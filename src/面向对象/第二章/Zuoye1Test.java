package 面向对象.第二章;

import java.util.Scanner;

public class Zuoye1Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Zuoye1 a = new Zuoye1();
        boolean b = true;
        do {
            System.out.print("请输入客户的姓名：");
            String name = input.next();
            System.out.print("继续输入吗？（y/n）");
            String n = input.next();
            a.addName(name);
            if (n.equals("n")){
                b = false;
                break;
            }
        }while (true);
        System.out.println("**********************");
        System.out.println("\t\t客户姓名列表：");
        System.out.println("**********************");
        a.showName();
        System.out.println();
        System.out.print("请输入要修改的学生姓名：");
        String oldName = input.next();
        System.out.print("请输入新的学生姓名：");
        String newName = input.next();
        System.out.println("*******修改结果*******");
        boolean q = a.editName(oldName,newName);
        if (q == true){
            System.out.println("找到并修改成功！");
        }else {
            System.out.println("修改失败");
        }
        System.out.println("**********************");
        System.out.println("\t\t客户姓名列表：");
        System.out.println("**********************");
        a.showName();
    }
}
