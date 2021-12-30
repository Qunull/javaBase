package HTML.考试.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean y = true;
        while (y){
            System.out.println("请输入录入信息：");
            String string = input.next();
            String substring = string.substring(0,string.length()-1);
            String[] split = substring.split("，");
            String name =  split[0];
            String sex =  split[1];
            String add =  split[2];
            String num =  split[3];
            /*System.out.print("请输入姓名：");
            String name = input.next();
            System.out.print("请输入性别：");
            String sex = input.next();
            System.out.print("请输入地址：");
            String add = input.next();
            System.out.print("请输入电话号码：");
            int num = input.nextInt();*/
            s1.add( new Student(name,sex,add,num));
            System.out.println("录入成功！");
            System.out.println("******学生信息******");
            System.out.println("姓名\t性别\t地址\t电话");
            for (Student st : s1){
                System.out.println(st.getName()+"\t"+st.getSex()+"\t"+st.getAdress()+"\t"+st.getNum());
            }
            System.out.println("是否继续？（y/n）");
            String a = input.next();
            if (!a.equals("y")){
                y = false;
            }
        }
    }
}
