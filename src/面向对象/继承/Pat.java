package 面向对象.继承;

public class Pat {
    private String name;
    private int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void print(){
        System.out.println("我是："+name+" 亲密度："+love);
    }
}
