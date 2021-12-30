package 面向对象.多态;

public class Dog extends Pat{
    @Override
    public void toHospital() {
        System.out.println("打针，吃药");
        this.setHealth(60);
    }

    @Override
    public void eat() {
            System.out.println("吃狗粮...健康值+5");
            this.setHealth(getHealth()+5);
            if (this.getHealth() > 100){
                this.setHealth(100);
            }
    }
    public void play(){
        System.out.println("玩接飞盘");
        System.out.println("亲密度加3");
        this.setLove(getLove()+3);
    }
}
