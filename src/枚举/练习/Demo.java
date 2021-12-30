package 枚举.练习;

public class Demo {
    public void showName(AL al){
        switch (al){
            case L1:
                System.out.println("大数据开发工程师");
                break;
            case L2:
                System.out.println("大数据挖掘工程师");
                break;
            case L3:
                System.out.println("大数据架构师");
                break;
        }
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.showName(AL.L1);
        demo.showName(AL.L2);
        demo.showName(AL.L3);
    }
}
