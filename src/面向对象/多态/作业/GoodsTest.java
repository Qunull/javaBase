package 面向对象.多态.作业;

public class GoodsTest {
    public Goods goods(Goods a){
        if (a instanceof TVs){
            a.price();
            return new TVs();
        }
        if (a instanceof Foods){
            a.price();
            return new Foods();
        }
        return null;
    }

    public static void main(String[] args) {
        GoodsTest goodsTest = new GoodsTest();
        Foods foods = new Foods();
        goodsTest.goods(foods);
    }
}
