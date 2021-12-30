package 面向对象.继承.作业;

public class CarAuto extends Auto{
    private String hvac;
    private String CD;

    public String getHvac() {
        return hvac;
    }

    public void setHvac(String hvac) {
        this.hvac = hvac;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }
    public void hasten(){
        super.setSpeed(getSpeed()+20);
        System.out.println("当前速度为："+super.getSpeed());
    }
    public void slowdown(){
        super.setSpeed(getSpeed()-10);
        System.out.println("当前速度为："+super.getSpeed());
    }
    public void stop(){
        super.setSpeed(0);
        System.out.println("当前速度为："+super.getSpeed());
        System.out.println("停车");
    }

    public static void main(String[] args) {
        CarAuto c = new CarAuto();
        c.setSpeed(50);
        c.hasten();
        c.slowdown();
        c.stop();
    }
}
