package 面向对象.多态;

public class Penguin extends Pat{
    @Override
    public void toHospital() {
        System.out.println("吃药，睡觉");
        this.setHealth(60);
    }

    @Override
    public void eat() {
            System.out.println("吃鱼");
            this.setHealth(getHealth()+3);
        if (this.getHealth() > 100){
            this.setHealth(100);
        }
    }
    public void play(){
        System.out.println("游泳");
        System.out.println("亲密度加3");
        this.setLove(getLove()+3);
    }
}
