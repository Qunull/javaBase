package 线程.作业;

public class Zuoye1 implements Runnable {
    private static int mi = 1000;
    private static int mi1 = 10;
    private static int op = 0;
    private static boolean aa = true;
    public static synchronized void a() {
            System.out.println(Thread.currentThread().getName() + "号选手拿到了接力棒！");
            while (aa) {
                    System.out.println(Thread.currentThread().getName() + "号选手跑了" + mi1 + "米!");
                    mi1 += 10;
                    mi -= 10;
                    op += 10;
                    if (op == 100) {
                        aa = false;
                    }
                }
            aa = true;
            op = 0;
            }
        @Override
        public void run () {
            a();
        }

        public static void main (String[]args){
            Zuoye1 z1 = new Zuoye1();
            Thread t1 = new Thread(z1);
            t1.setName("1");
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z2 = new Zuoye1();
            Thread t2 = new Thread(z2);
            t2.setName("2");
            t2.start();
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z3 = new Zuoye1();
            Thread t3 = new Thread(z3);
            t3.setName("3");
            t3.start();
            try {
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z4 = new Zuoye1();
            Thread t4 = new Thread(z4);
            t4.setName("4");
            t4.start();
            try {
                t4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z5 = new Zuoye1();
            Thread t5 = new Thread(z5);
            t5.setName("5");
            t5.start();
            try {
                t5.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z6 = new Zuoye1();
            Thread t6 = new Thread(z6);
            t6.setName("6");
            t6.start();
            try {
                t6.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z7 = new Zuoye1();
            Thread t7 = new Thread(z7);
            t7.setName("7");
            t7.start();
            try {
                t7.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z8 = new Zuoye1();
            Thread t8 = new Thread(z8);
            t8.setName("8");
            t8.start();
            try {
                t8.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z9 = new Zuoye1();
            Thread t9 = new Thread(z9);
            t9.setName("9");
            t9.start();
            try {
                t9.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Zuoye1 z10 = new Zuoye1();
            Thread t10 = new Thread(z10);
            t10.setName("10");
            t10.start();
            try {
                t10.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
