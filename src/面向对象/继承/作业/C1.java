package 面向对象.继承.作业;

public class C1 extends B1{
    public void c(){
        System.out.println("This is C");
    }

    public static void main(String[] args) {
        C1 c = new C1();
        c.a();
        c.b();
        c.c();
    }
}
