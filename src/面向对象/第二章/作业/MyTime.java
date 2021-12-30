package 面向对象.第二章.作业;

import java.util.Scanner;

public class MyTime {
    public int hour;
    public int minute;
    public int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void display(){
        System.out.println("现在时间是："+hour+"时"+minute+"分"+second+"秒");
    }
    public void addSecond(int sec){
        second += sec;
        if (second > 59){
            int temp = second/60;
            addMinute(temp);
            second = second % 60;
        }
    }
    public void addMinute(int min){
        minute += min;
        if (minute > 59){
            int temp = minute/60;
            addHour(temp);
            minute = minute % 60;
        }
    }
    public void addHour(int hour){
        int temp = this.hour;
        this.hour += hour;
        if (this.hour > 23){
            this.hour = temp + hour % 24;
        }
    }
    public void subSeconde(int sec){
        second -= sec;
        while (this.second < 0){
            second += 60;
            subMinute(1);
        }
    }
    public void subMinute(int min){

    }
    public void subHour(int hou){

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入当前时间");
        int hour = input.nextInt();
        int minute = input.nextInt();
        int second = input.nextInt();
        MyTime myTime = new MyTime(hour,minute,second);
        myTime.display();
        System.out.println("增加的秒数：");
        int sec = input.nextInt();
        myTime.addSecond(sec);
        System.out.println("增加的分钟：");
        int min = input.nextInt();
        myTime.addMinute(min);
        System.out.println("增加的小时：");
        int hou = input.nextInt();
        myTime.addHour(hou);
        myTime.display();
    }
}
