package 面向对象.多态.作业;

public class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("狗狗发出哭声");
    }

    @Override
    public void getAnimalName() {
        System.out.println("狗");
    }
}
