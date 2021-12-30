package 面向对象.重写.作业;

import javax.naming.Name;

public class Person1 {
    private String name;
    private String address;
    private int numb;
    private String emile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public String getEmile() {
        return emile;
    }

    public void setEmile(String emile) {
        this.emile = emile;
    }

    @Override
    public String toString() {
        String a = "姓名："+ name+"\n"+"地址："+address+"\n"+"电话："+numb+"\n"+"邮箱："+emile;
        return a ;
    }
}
