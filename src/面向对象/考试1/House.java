package 面向对象.考试1;

public class House {
    private int num;
    private String type;
    private double money;
    private int rNo;

    Region region = new Region();

    static House[] houses = new House[10];

    public House(int num, String type, double money, int rNo) {
        this.num = num;
        this.type = type;
        this.money = money;
        this.rNo = rNo;
    }

    public House() {
    }
    public House(String type) {
    }
    public House(int money) {
    }

    public static void init() {
        houses[0] = new House(1, "一居室", 500000, 1);
        houses[1] = new House(2, "两居室", 1500000, 1);
        houses[2] = new House(1, "一居室", 500000, 2);
        houses[3] = new House(2, "两居室", 1500000, 2);
        houses[4] = new House(1, "一居室", 500000, 3);
        houses[5] = new House(2, "两居室", 1000000, 3);
        houses[6] = new House(1, "一居室", 300000, 4);
        houses[7] = new House(2, "两居室", 600000, 4);
        houses[8] = new House(1, "一居室", 400000, 5);
        houses[9] = new House(2, "两居室", 600000, 5);
    }
    House[] b = new House[5];
    House[] c = new House[5];
    public void showHouse(int rNo) {
        for (House h : houses) {
           if (h.rNo == rNo){
               System.out.println( "编号：" + h.getNum() + ",房屋类型：" + h.getType() + ",房屋价格：" + h.getMoney());
           }
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public static House[] getHouses() {
        return houses;
    }

    public static void setHouses(House[] houses) {
        House.houses = houses;
    }
}
