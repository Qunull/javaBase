package 线程.练习;

public class Look implements Runnable{
    private int num;
    private int time;
    public Thread te;

    public Look(int num, int time) {
        this.num = num;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 1; i <= num; i++) {
            System.out.println(Thread.currentThread().getName()+":这里是"+i+"号病人");
            try {
                Thread.sleep(time*1000);
                if (Thread.currentThread().getName().equals("普通号") && i==10){
                   te.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+"完成");
    }

    public static void main(String[] args) {




        Look look1 = new Look(10,2);
        Thread t11 = new Thread(look1);
        t11.setName("特需号");
        t11.setPriority(Thread.MAX_PRIORITY);
        t11.start();
        /*if (look.count==10){
            try {
                t11.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        Look look = new Look(50,1);
        Thread t1 = new Thread(look);
        t1.setName("普通号");
        look.te = t11;
        t1.start();
    }
}
