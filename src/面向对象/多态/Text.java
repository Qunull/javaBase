package 面向对象.多态;

public class Text {
    public static void main(String[] args) {
        Pat pet = new Dog();
        Dog dog = new Dog();
        dog.setName("怡怡");
        dog.setHealth(10);
        dog.setLove(20);
        dog.show();
        Master master = new Master();
        master.cure(dog);
        dog.show();
        master.feed(dog);
        dog.show();
    }
}
