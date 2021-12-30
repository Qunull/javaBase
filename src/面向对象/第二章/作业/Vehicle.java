package 面向对象.第二章.作业;

public class Vehicle {
    public double speed;
    public double size;

    public Vehicle() {
    }

    public Vehicle(double speed,double size) {
        this.speed = speed;
        this.size = size;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size = size;
    }
    public void move(){
        System.out.println("交通工具：公交车");
    }
    public void speedUp(int addSpeed){
        this.setSpeed(this.getSpeed()+addSpeed);
    }
    public void speedDown(int addSpeed){
        this.setSpeed(this.getSpeed()-addSpeed);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(100);
        vehicle.setSize(5);
        System.out.println("速度："+vehicle.getSpeed()+"m/s\t长度："+vehicle.getSize()+"m");
        vehicle.speedUp(10);
        System.out.println(vehicle.getSpeed());
        vehicle.speedDown(5);
        System.out.println(vehicle.getSpeed());

        Vehicle vehicle1 = new Vehicle(150,9);
        System.out.println("速度："+vehicle1.getSpeed()+"m/s\t长度："+vehicle1.getSize()+"m");
    }
}
