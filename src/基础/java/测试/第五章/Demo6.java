package 基础.java.测试.第五章;

public class Demo6 {
    public static void main(String[] args) {
        int men ;
        int women ;
        int child ;
        for (men = 0;men<=16;men++){
            for (women = 0;women<=25;women++){
                for (child = 0;child<=30;child++){
                    if ((men+women+child==30) && (3*men+2*women+child==50)){
                        System.out.println("男人："+men+"女人："+women+"小孩："+child);
                    }
                }
            }
        }
    }
}
