package 线程;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread myThread = Thread.currentThread();
        System.out.println("线程名称："+myThread.getName());
        myThread.setName("阿飞");
        System.out.println("线程名称："+myThread.getName());
    }
}
