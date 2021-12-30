package 面向对象.汽车租赁二;

public class Car extends MotoVehicle{
    private String type;

    public Car(String vehicleNo, String brand, double rent,String type) {
        super(vehicleNo, brand, rent);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calRent(int days) {
        double price = 0;
        if (days > 150){
            price = getRent() * days * 0.7;
        }else if (days > 30){
            price = getRent() * days * 0.8;
        }else if (days > 7){
            price = getRent() * days * 0.9;
        }else {
            price = getRent() * days ;
        }
        return price;
    }
}
