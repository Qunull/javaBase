package 面向对象;

import java.util.Scanner;

public class Demo2 extends Demo1{
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int a(int a,int b) {
        int c ;
        c = a + b;

        return c ;
    }
    public int b(){
        int c ;
        c = getA() + b;

        return c ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demo2 demo2 = new Demo2();
        System.out.println("a 的值：");
        int a = input.nextInt();
        System.out.println("b 的值：");
        int b = input.nextInt();
        demo2.setA(a);
        demo2.setB(b);
        System.out.println(demo2.b());
        System.out.println(demo2.a(a,b));
    }
}
