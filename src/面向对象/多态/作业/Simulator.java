package 面向对象.多态.作业;

public class Simulator {
    public void playSound(Animal animal){
        animal.getAnimalName();
        animal.cry();
    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Dog dog = new Dog();
        simulator.playSound(dog);
    }
}
