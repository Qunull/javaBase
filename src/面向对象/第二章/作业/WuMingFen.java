package 面向对象.第二章.作业;

public class WuMingFen {
    public  String theMa;
    public int quantity;
    public boolean likeSoup;

    public WuMingFen() {
        this("酸辣",2,true);
    }

    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }
    public void show(){
        String content = "点的"+theMa+"粉，分量："+quantity+"两，";
        if (likeSoup){
            content += "带汤的粉";
        }else {
            content += "不带汤的粉";
        }
        System.out.println(content);
    }

    public static void main(String[] args) {
        WuMingFen f1 = new WuMingFen("牛肉",3,true);
        f1.show();
        WuMingFen f2 = new WuMingFen("牛肉",2);
        f2.show();
        WuMingFen f3 = new WuMingFen();
        f3.show();
    }
}
