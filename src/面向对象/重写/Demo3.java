package 面向对象.重写;

public class Demo3 {
    public static void main(String[] args) {
        int a =0 ;


        while (true){

            a++;
            if (a == 3){
                System.out.println(
                        "a ==============" +a
                );
                continue;
            }
            System.out.println("a = "+a);


            if (a > 5) {
                break;
            }
        }
        System.out.println("============== "+a);
    }
}
