package 面向对象.多态.作业;

public class Circle extends Shape{
    private int r;
    double pai = Math.PI;
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void perimeter() {
        System.out.println("圆的周长等于:"+(2*r*pai));
    }

    @Override
    public void area() {
        System.out.println("圆的面积等于："+(r*r*pai));
    }

    @Override
    public void setcolor() {
        System.out.println("圆是红色");
    }
}
