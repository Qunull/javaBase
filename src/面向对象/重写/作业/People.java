package 面向对象.重写.作业;

public class People extends Monkey{


    public People(String s) {
        System.out.println("我是人类"+s);
    }

    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think(){
        System.out.println("别说话！认真思考！");
    }
}
