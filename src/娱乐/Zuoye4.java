package 娱乐;

import java.util.Scanner;

public class Zuoye4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = (int)(Math.random()*101);
        System.out.print("请猜数(1-100)：");
        int b = input.nextInt();
        int c = 10;
        do {
            if (a == b){
                System.out.println("猜对了,你真棒！");
                break;
            }else if (a > b){
                System.out.println("猜小了，您还有"+c+"次机会");
            }else {
                System.out.println("猜大了，您还有"+c+"次机会");
            }
            System.out.print("再试一次：");
            b = input.nextInt();
            c--;
            if (c == 0){
                System.out.println("您的机会已用完！");
                break;
            }
        }while (c <= 10);
        if (c == 10){
            System.out.println("经过系统评估，您的运气为：一发入魂");
        }else if ((c < 10) && (c >= 7)){
            System.out.println("经过系统评估，您的运气为：运气不错");
        }else if ((c < 7) && (c >= 5)){
            System.out.println("经过系统评估，您的运气为：运气还可");
        }else if ((c < 5) && (c > 0)){
            System.out.println("经过系统评估，您的运气为：运气不好");
        }else {
            System.out.println("经过系统评估，您的运气为：下次一定");
        }
    }
}
