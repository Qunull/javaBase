package 面向对象.多态.作业;

public class Triangele extends Shape{
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void perimeter() {
        System.out.println("三角形的周长为："+(x+y+z));
    }

    @Override
    public void area() {
        System.out.println("三角形的面积为："+((x*y)/2));
    }

    @Override
    public void setcolor() {
        System.out.println("这个三角型是红色的");
    }
}
