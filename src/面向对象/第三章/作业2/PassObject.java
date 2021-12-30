package 面向对象.第三章.作业2;

import java.util.Scanner;

public class PassObject {
    Circle circle = new Circle();
    public void printAreas(Circle c,int time){
        for (int i = 0; i < time; i++) {
            System.out.print("半径为"+(i+1)+"时");
            circle.findArea(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        PassObject passObject = new PassObject();
        System.out.println("输入循环次数：");
        int b = input.nextInt();
        passObject.printAreas(circle,b);
    }
}
