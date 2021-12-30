package 面向对象.多态.作业;

public class Store {
    private String name;
    private String address;
    private int people;
    private int money;

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

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Store(String name, String address, int people, int money) {
        this.name = name;
        this.address = address;
        this.people = people;
        this.money = money;
    }

    public Store() {
    }

    public void open(){}
    public void close(){}
    public void shopping(){}
}
