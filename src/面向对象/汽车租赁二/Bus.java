package 面向对象.汽车租赁二;

public class Bus extends MotoVehicle{
    private int seat;

    public Bus(String vehicleNo, String brand, double rent,int seat) {
        super(vehicleNo, brand, rent);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public double calRent(int days) {
        double price = 0;
        if (days >= 150){
            price = getRent() * days * 0.6;
        }else if (days >= 30){
            price = getRent() * days * 0.7;
        }else if (days >= 7){
            price = getRent() * days * 0.8;
        }else if (days >= 3){
            price = getRent() * days * 0.9;
        }else {
            price = getRent() * days ;
        }
        return price;
    }
}
