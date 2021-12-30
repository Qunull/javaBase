package 线程.作业;

public class Zuoye2 implements Runnable {
    private static int num = 9;
    private static int count = 1;
    private static boolean a = true;
    private static int c = 1;

    public static synchronized void a() {
        if (num < 0) {
            a = false;
            return;
        }
        System.out.println(Thread.currentThread().getName() + "抢到了第" + count + "张票，还剩下" + num + "张车票。。。");
        num--;
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public synchronized void run() {
        while (a) {
            a();
            if (Thread.currentThread().getName().equals("黄牛党")) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Zuoye2 z1 = new Zuoye2();
        Thread t1 = new Thread(z1);
        t1.setName("桃跑跑");
        t1.start();

        Zuoye2 z2 = new Zuoye2();
        Thread t2 = new Thread(z2);
        t2.setName("张票票");
        t2.start();

        Zuoye2 z3 = new Zuoye2();
        Thread t3 = new Thread(z3);
        t3.setName("黄牛党");
        t3.start();
    }
}
