package 面向对象.汽车租赁;

public class AutoBusiness {
    public Auto motoLeaseOut(Auto motoType){
        if (motoType instanceof Car){
            return new Car();
        }
        if (motoType instanceof Bus){
            return new Bus();
        }
        return null;
    }
}
