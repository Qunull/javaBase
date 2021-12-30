package 面向对象.汽车租赁;

import com.sun.org.apache.regexp.internal.RE;

public class Car extends Auto{
    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    public Car(){

    }
    public Car(String brand,double money,String plate,String model){
        this.setBrand(brand);
        this.setMoney(money);
        this.setPlate(plate);
        this.setModel(model);
    }
    static Car[] car = new Car[4];
    public static void init(){
        car[0] = new Car("宝马", 800, "京NY28588", "X6");
        car[1] = new Car("宝马", 600, "京CNY3284", "550i");
        car[2] = new Car("别克", 300, "京NT37465", "林荫大道");
        car[3] = new Car("别克", 600, "京NT96968", "GL8");
    }
    public void show(int a){
        if (a == 1){
            for (int i = 0; i < 2; i++) {
                System.out.print((i+1)+"."+car[i].getModel()+"  ");
            }
        }
        if (a == 2){
            for (int i = 2; i < 4; i++) {
                System.out.print((i-1)+"."+car[i].getModel()+"  ");
            }
        }
    }
    @Override
    public void calRent(String brand ,int choose, int days) {
        for (Car car : car) {
            if (car.getBrand().equals("宝马") && choose == 1) {
                if (days > 7) {
                    car.setMoney(days * car.getMoney() * 0.9);
                } else if (days > 30) {
                    car.setMoney(days * car.getMoney() * 0.8);
                } else if (days > 150) {
                    car.setMoney(days * car.getMoney() * 0.7);
                } else {
                    car.setMoney(days * car.getMoney());
                }
                System.out.println(car.getMoney());
                break;
            }
            if (car.getBrand().equals("宝马") && choose == 2) {
                if (days > 7) {
                    car.setMoney(days * car.getMoney() * 0.9);
                } else if (days > 30) {
                    car.setMoney(days * car.getMoney() * 0.8);
                } else if (days > 150) {
                    car.setMoney(days * car.getMoney() * 0.7);
                } else {
                    car.setMoney(days * car.getMoney());
                }
                System.out.println(car.getMoney());
                break;
            }
            if (car.getBrand().equals("别克") && choose == 1) {
                setMoney(400);
                if (days > 7) {
                    car.setMoney(days * car.getMoney() * 0.9);
                } else if (days > 30) {
                    car.setMoney(days * car.getMoney() * 0.8);
                } else if (days > 150) {
                    car.setMoney(days * car.getMoney() * 0.7);
                } else {
                    car.setMoney(days * car.getMoney());
                }
                System.out.println(car.getMoney());
                break;
            }
            if (car.getBrand().equals("别克") && choose == 2) {
                if (days > 7) {
                    car.setMoney(days * car.getMoney() * 0.9);
                } else if (days > 30) {
                    car.setMoney(days * car.getMoney() * 0.8);
                } else if (days > 150) {
                    car.setMoney(days * car.getMoney() * 0.7);
                } else {
                    car.setMoney(days * car.getMoney());
                }
                System.out.println(car.getMoney());
                break;

            }

        }

    }


    @Override
    public void leaseOitFlow() {

    }
}
