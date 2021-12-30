package 面向对象.第二章.作业;

import java.util.Scanner;

public class Vehicle1 {
    public double speed;
    public int size;
    public void move(){

    }
    public void show(){
        System.out.println("汽车容量："+size+"人，初始速度"+"km/h");
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void speedUp(){
        this.speed += 10;
    }
    public void speedDown(){
        this.speed -= 10;
    }

    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1();
        Scanner input = new Scanner(System.in);
        System.out.println("初始速度：");
        vehicle.setSpeed(input.nextDouble());
        System.out.println("汽车容量：");
        vehicle.size = input.nextInt();
        vehicle.show();
        String answer = "";
        while (!answer.equals("n")){
            System.out.println("选择操作 1加速 2减速");
            int choose = input.nextInt();
            switch (choose){
                case 1:
                    vehicle.speedUp();
                    System.out.println("当前速度"+vehicle.speed+"km/h");
                    break;
                case 2:
                    vehicle.speedDown();
                    System.out.println("当前速度"+vehicle.speed+"km/h");
                    break;
            }
            System.out.println("是否继续y/n");
            answer = input.next();
        }
    }
}
