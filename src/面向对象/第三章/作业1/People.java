package 面向对象.第三章.作业1;

public class People {
    public static int count = 0;

    public static void main(String[] args) {
        People e1 = new People();
        People e2 = new People();
        People e3 = new People();
        for (int i = 0; i < 60; i++) {
            e1.count++;
        }
        for (int i = 0; i < 180; i++) {
            e2.count++;
        }
        for (int i = 0; i < 90; i++) {
            e3.count++;
        }
        System.out.println("人数"+People.count);
    }
}
