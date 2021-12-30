package 基础.java.测试.第五章;

public class Demo2 {
    public static void main(String[] args) {
        //矩形 外层行 内层列
       /* for(int a =1; a<= 4;a++){
            for (int b = 1;b<=10;b++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //直角三角形
       /* for (int a = 1;a<=6;a++){//1 2 3
            for (int b = 1;b<=a;b++){//1 2
                System.out.print("*");
            }
            System.out.println();
        }*/
        //倒直角三角形
        /*for (int a = 1;a<=6;a++){//1 2 3 4 5 6
            for (int b = 1;b<=(6-a+1);b++){//1 2 3 4 1 2
                System.out.print("*");
            }
            System.out.println();*/
        //平行四边形
           /* for (int a = 1;a<=4;a++){
                for (int b = 1;b<=a;b++){
                    System.out.print(" ");
                }
                for (int c =1;c<=8;c++){
                    System.out.print("*");
                }
                System.out.println();
            }*/
        //等腰三角形
        /*for (int a = 1;a<=6;a++){
            for (int b = 0;b<(6+1-a);b++){
                System.out.print(" ");
            }
            for (int c = 1;c<=(2*a-1);c++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
