package 面向对象.重写.作业;

public class Rectangle {
    private int length;
    private int wide;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int area(int length, int wide){
        int a = length * wide;
        return a;
    }
}
