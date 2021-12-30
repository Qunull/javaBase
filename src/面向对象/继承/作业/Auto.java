package 面向对象.继承.作业;

public class Auto {
    private int num;
    private String color;
    private double weight;
    private double speed = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void hasten(){
        this.speed += 10;
        System.out.println("当前速度为："+speed);
    }
    public void slowdown(){
        this.speed -= 10;
        System.out.println("当前速度为："+speed);
    }
    public void stop(){
        this.speed = 0;
        System.out.println("当前速度为："+speed);
        System.out.println("停车");
    }
}
