package 面向对象.继承;

public class Dog extends Pat{
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    public void print1(){
        super.setName("123");
    }
}
