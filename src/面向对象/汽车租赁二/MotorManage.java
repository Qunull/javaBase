package 面向对象.汽车租赁二;

import java.util.Scanner;

public class MotorManage {
    public static void main(String[] args) {
        MotorOperation operation = new MotorOperation();
        operation.init();
        String brand = "";
        String type = "";
        int seat = 0;
        MotoVehicle vehicle = null;
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到租车公司");
        System.out.println();
        System.out.print("请选择车的类型（1.轿车  2.客车）:");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println("请选择要租赁的轿车品牌（1.宝马  2.别克）：");
                int ch2 = input.nextInt();
                switch (ch2){
                    case 1:
                        brand = "宝马";
                        System.out.println("请输入要租赁的轿车型号（1.X6  2.550i）:");
                        int ch3 = input.nextInt();
                        if (ch3 == 1){
                            type = "X6";
                        }else {
                            type = "550i";
                        }
                        break;
                    case 2:
                        brand = "别克";
                        System.out.println("请输入要租赁的轿车型号（1.林荫大道  2.GL8）:");
                        int ch4 = input.nextInt();
                        if (ch4 == 1){
                            type = "林荫大道";
                        }else {
                            type = "GL8";
                        }
                        break;
                }
                vehicle = operation.getMotor(brand,type);
                break;
            case 2:
                System.out.println("请选择要租赁的轿车品牌（1.金杯  2.金龙）：");
                int ch5 = input.nextInt();
                switch (ch5){
                    case 1:
                        brand = "金杯";
                        System.out.println("请输入要租赁的客车座位数（1.16  2.34）:");
                        int ch3 = input.nextInt();
                        if (ch3 == 1){
                            seat = 16;
                        }else {
                            seat = 34;
                        }
                        break;
                    case 2:
                        brand = "金龙";
                        System.out.println("请输入要租赁的客车座位数（1.16  2.34）:");
                        int ch4 = input.nextInt();
                        if (ch4 == 1){
                            seat = 16;
                        }else {
                            seat = 34;
                        }
                        break;
                }
                vehicle = operation.getMotor(brand,seat);
                break;
        }

        System.out.println("请输入要租赁的天数：");
        int days = input.nextInt();
        double price = vehicle.calRent(days);
        System.out.println("分配给您的汽车车牌号是："+vehicle.getVehicleNo());
        System.out.println("您需要支付的租赁费用是："+price);
    }
}
