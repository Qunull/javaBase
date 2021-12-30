package 面向对象.多态.作业;

public class DirectSale extends Store{
    private String drectSaleName;
    private int drectSalePeople;
    private int drectSaleMoney;
    private int drectSaleDiscount;

    public String getDrectSaleName() {
        return drectSaleName;
    }

    public void setDrectSaleName(String drectSaleName) {
        this.drectSaleName = drectSaleName;
    }

    public int getDrectSalePeople() {
        return drectSalePeople;
    }

    public void setDrectSalePeople(int drectSalePeople) {
        this.drectSalePeople = drectSalePeople;
    }

    public int getDrectSaleMoney() {
        return drectSaleMoney;
    }

    public void setDrectSaleMoney(int drectSaleMoney) {
        this.drectSaleMoney = drectSaleMoney;
    }

    public int getDrectSaleDiscount() {
        return drectSaleDiscount;
    }

    public void setDrectSaleDiscount(int drectSaleDiscount) {
        this.drectSaleDiscount = drectSaleDiscount;
    }
    public void deliver(){}

    @Override
    public void open() {
        System.out.println("直营店开店");
    }

    @Override
    public void close() {
        System.out.println("直营店关闭");
    }

    @Override
    public void shopping() {
        System.out.println("直营店购物");
    }
    public void show(){
        System.out.println("直营店店长："+drectSaleName);
        System.out.println("直营店商品起送金额："+drectSaleMoney);
    }
}
