package 接口.作业.飞;

public class Plane implements CanFly{
    @Override
    public void fly() {
        System.out.println("飞机起飞");
    }
}
