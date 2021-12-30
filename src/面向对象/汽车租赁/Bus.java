package 面向对象.汽车租赁;

public class Bus extends Auto{
    private String seat;

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    public Bus (){}
    public Bus (String brand,double money,String plate,String seat){
        this.setBrand(brand);
        this.setMoney(money);
        this.setPlate(plate);
        this.setSeat(seat);
    }
    static Bus[] bus = new Bus[4];
    public static void init(){
        bus[0] = new Bus("金杯",800,"京6566754","16座");
        bus[1] = new Bus("金龙",800,"京8696997","16座");
        bus[2] = new Bus("金杯",1500,"京9696996","32座");
        bus[3] = new Bus("金龙",1500,"京8696998","32座");
    }
    @Override
    public void calRent(String brand,int choose,int days) {
        for (Bus bus : bus) {
            if (bus.getBrand().equals(("金杯")) && choose == 1){
                if (days >= 3) {
                    bus.setMoney(days * bus.getMoney() * 0.9);
                } else if (days >= 7) {
                    bus.setMoney(days * bus.getMoney() * 0.8);
                } else if (days >= 30) {
                    bus.setMoney(days * bus.getMoney() * 0.7);
                } else if (days >= 150) {
                    bus.setMoney(days * bus.getMoney() * 0.6);
                } else {
                    bus.setMoney(days * bus.getMoney());
                }
                System.out.println(bus.getMoney());
                break;
            }
            if (bus.getBrand().equals(("金杯")) && choose == 2){
                if (days >= 3) {
                    bus.setMoney(days * bus.getMoney() * 0.9);
                } else if (days >= 7) {
                    bus.setMoney(days * bus.getMoney() * 0.8);
                } else if (days >= 30) {
                    bus.setMoney(days * bus.getMoney() * 0.7);
                } else if (days >= 150) {
                    bus.setMoney(days * bus.getMoney() * 0.6);
                } else {
                    bus.setMoney(days * bus.getMoney());
                }
                System.out.println(bus.getMoney());
                break;
            }
            if (bus.getBrand().equals(("金龙")) && choose == 1){
                if (days >= 3) {
                    bus.setMoney(days * bus.getMoney() * 0.9);
                } else if (days >= 7) {
                    bus.setMoney(days * bus.getMoney() * 0.8);
                } else if (days >= 30) {
                    bus.setMoney(days * bus.getMoney() * 0.7);
                } else if (days >= 150) {
                    bus.setMoney(days * bus.getMoney() * 0.6);
                } else {
                    bus.setMoney(days * bus.getMoney());
                }
                System.out.println(bus.getMoney());
                break;
            }
            if (bus.getBrand().equals(("金龙")) && choose == 2){
                if (days >= 3) {
                    bus.setMoney(days * bus.getMoney() * 0.9);
                } else if (days >= 7) {
                    bus.setMoney(days * bus.getMoney() * 0.8);
                } else if (days >= 30) {
                    bus.setMoney(days * bus.getMoney() * 0.7);
                } else if (days >= 150) {
                    bus.setMoney(days * bus.getMoney() * 0.6);
                } else {
                    bus.setMoney(days * bus.getMoney());
                }
                System.out.println(bus.getMoney());
                break;
            }
        }
    }

    @Override
    public void leaseOitFlow() {

    }
}
