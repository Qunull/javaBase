package 面向对象.第二章.作业;

import java.util.Scanner;

public class Addition {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
    public String add(String num1,String num2){
        return num1+num2;
    }
    public double add(double num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("加数");
        int num1 = input.nextInt();
        System.out.println("被加数");
        int num2 = input.nextInt();
        Addition addition = new Addition();
        System.out.println(addition.add(num1,num2));
    }
}
