package 线程;

public class Demo implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"这里是"+Thread.currentThread().getName());
        }
    }
}
