package 面向对象.汽车租赁二;

public class MotorOperation {
    MotoVehicle[] motors = new MotoVehicle[8];


    public void init(){
        motors[0] = new Car("京NY28588","宝马",800,"X6");
        motors[1] = new Car("京CNY3284","宝马",600,"550i");
        motors[2] = new Car("京NY37465","别克",300,"林荫大道");
        motors[3] = new Car("京NY96968","别克",600,"GL8");
        motors[4] = new Bus("京6566754","金杯",800,16);
        motors[5] = new Bus("京8696997","金龙",800,16);
        motors[6] = new Bus("京9696996","金杯",1500,34);
        motors[7] = new Bus("京8696998","金龙",1500,34);
    }
    public MotoVehicle getMotor(String brand,String type){
        MotoVehicle motor = null;
        for (MotoVehicle moto : motors){
            if (moto instanceof Car){
                Car car = (Car) moto;
                if (car.getBrand().equals(brand) && car.getType().equals(type)){
                    motor = car;
                    break;
                }
            }
        }
        return motor;
    }
    public MotoVehicle getMotor(String brand,int seat){
        MotoVehicle motor = null;
        for (MotoVehicle moto : motors){
            if (moto instanceof Bus){
                Bus bus = (Bus) moto;
                if (bus.getBrand().equals(brand) && bus.getSeat() == seat){
                    motor = bus;
                    break;
                }
            }
        }
        return motor;
    }
}
