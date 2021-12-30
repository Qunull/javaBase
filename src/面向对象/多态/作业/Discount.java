package 面向对象.多态.作业;

public class Discount extends Store{
    private int max;
    private int min;
    private String count;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
    public void DiscountCount(){}

    @Override
    public void open() {
        System.out.println("折扣店开店");
    }

    @Override
    public void close() {
        System.out.println("折扣店关闭");
    }

    @Override
    public void shopping() {
        System.out.println("折扣店购物");
    }
    public void show(){
        System.out.println("折扣店最大折扣金额："+max);
        System.out.println("折扣店最小折扣金额："+min);
    }
}
