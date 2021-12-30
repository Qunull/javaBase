package 面向对象.继承.作业;

import java.util.Scanner;

public class B extends A{
    private char a;
    
    public void g(){
        for (int i = 65; i < 91; i++) {
            a = (char)i;
            System.out.print(a+"\t");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        B b = new B();
        System.out.print("请选择输出的字母表1.大写 2.小写：");
        int a = input.nextInt();
        switch (a){
            case 1:
                b.g();
                break;
            case 2:
                b.f();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
