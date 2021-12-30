package 基础.java.测试;

public class Zuoye6 {
    public static void main(String[] args) {
        System.out.println("FlipFlop");
        for (int a = 1;a <= 100 ;a++){
            if (a%3 == 0){
                System.out.print("Flip\t");
            }else if (a%5 == 0){
                System.out.print("Flop\t");
            }else if ((a%3 == 0) && (a%5 == 0)){
                System.out.print("FlipFlop\t");
            }else {
                System.out.print(a+"\t");
            }
        }
    }
}
