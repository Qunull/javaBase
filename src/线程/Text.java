package 线程;

public class Text {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread t1 = new Thread(demo);
        t1.setName("张三");
        t1.start();


        Demo demo1 = new Demo();
        Thread t11 = new Thread(demo1);
        t11.setName("lisi ");
        t11.start();
    }
}

