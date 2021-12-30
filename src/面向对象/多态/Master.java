package 面向对象.多态;

public class Master {
    public void cure(Pat pet){
        if (pet.getHealth() < 50){
            pet.toHospital();
        }
    }
    public void feed(Pat pet){
        if (pet.getHealth() < 70 ){
            while (pet.getHealth() < 100){
                pet.eat();
            }
        }
    }
}
