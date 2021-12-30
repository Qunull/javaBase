package 面向对象.多态.作业;

public class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("猫猫发出哭声");
    }

    @Override
    public void getAnimalName() {
        System.out.println("猫");
    }
}
