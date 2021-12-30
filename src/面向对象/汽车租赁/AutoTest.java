package 面向对象.汽车租赁;

import java.util.Scanner;

public class AutoTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Auto auto = new Car();
        Car car1 = (Car)auto;
        Car car = new Car();
        Car.init();
        Bus bus = new Bus();
        Bus.init();
        int b = 0;
        int c = 0;
        System.out.println("***********欢迎光临腾飞汽车租赁公司***********");
        System.out.println("1.轿车    2.客车");
        System.out.print("请选择你要租赁的汽车类型：");
        int a = input.nextInt();
        switch (a){
            case 1:
                System.out.print("请选择你要租赁的汽车品牌1.宝马 2.别克：");
                b = input.nextInt();
                switch (b){
                    case 1:
                        System.out.println("请选择你要租赁的汽车型号:");
                        car.show(1);
                        c = input.nextInt();
                        car.setBrand("宝马");
                        break;
                    case 2:
                        System.out.println("请选择你要租赁的汽车型号:");
                        car.show(2);
                        c = input.nextInt();
                        car.setBrand("别克");
                        break;
                }
                break;
            case 2:
                System.out.print("请选择你要租赁的汽车品牌1.金杯 2.金龙：");
                int d = input.nextInt();
                System.out.print("请选择你要租赁的客车座位1.16座 2.32座:");
                break;
        }
        System.out.print("请选择要租赁的天数：");
        int time = input.nextInt();
        System.out.println("分配给您的汽车牌号是：");
        System.out.println("需要支付的租赁费用是：");
        if (a == 1){
            auto = car;
        }else if (a == 2){
            auto = bus;
        }
        auto.calRent(car.getBrand(), c,time);
    }
}
