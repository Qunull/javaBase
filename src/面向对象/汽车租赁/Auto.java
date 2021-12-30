package 面向对象.汽车租赁;

public abstract class Auto {
    private String brand;
    private double money;
    private String plate;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    public abstract void calRent(String brand,int choose,int days);//计算租金
    public abstract void leaseOitFlow();//流程

}
