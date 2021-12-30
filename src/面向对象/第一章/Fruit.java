package 面向对象.第一章;

import java.util.Scanner;

public class Fruit {
    public void juice(String fruit) {
        System.out.println("新鲜的" + fruit + "汁");
    }

    public static void main(String[] args) {
        Fruit a = new Fruit();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入水果：");
        String food = input.next();
        a.juice(food);
    }
}