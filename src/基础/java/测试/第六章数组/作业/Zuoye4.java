package 基础.java.测试.第六章数组.作业;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] people = new String[]{"路人甲","炮灰乙","流氓丙","土匪丁"};
        boolean b = false;
        System.out.println("请输入姓名：");
        String a = input.next();
        for (int i = 0; i < people.length; i++) {
            if (a.equals(people[i])){
                System.out.println("我们组成员");
                b = true;
                break;
            }
        }
        if (b == false){
            System.out.println("对不起，我们组没有这个人。");
        }
    }
}
