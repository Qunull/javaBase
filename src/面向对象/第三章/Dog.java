package 面向对象.第三章;

public class Dog {
    private String name;
    private int health;
    private int love;
    private String brand = "拉布拉多";

    public void info(){
        System.out.println("我的名字叫"+name+"，我的健康值是"+health+"," +
                "亲密度是"+love+",我的品种是"+brand);
    }

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
        if (health >= 0 && health <= 100){
            this.health = health;
        }else {
            this.health = 60;
        }
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        if (love >= 0 && love <= 100) {
            this.love = love;
        }else {
            this.love = 60;
        }
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String gender) {
        this.brand = gender;
    }
}
