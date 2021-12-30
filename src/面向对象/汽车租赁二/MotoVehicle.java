package 面向对象.汽车租赁二;

public abstract class MotoVehicle {
    private String vehicleNo;
    private String brand;
    private double rent;


    public MotoVehicle(String vehicleNo, String brand, double rent) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.rent = rent;
    }

    public abstract double calRent(int days);
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

}
