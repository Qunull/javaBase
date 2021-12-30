package 面向对象.多态;

public abstract class Pat {
    private String name;
    private int health;
    private int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
    public void show(){
        System.out.println("我的名字是："+name+" 我的健康值："+health+" 我的亲密度："+love);
    }
    public void toHospital(){

    }
    public void eat(){}
}
