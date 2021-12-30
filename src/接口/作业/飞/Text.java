package 接口.作业.飞;

public class Text {
    void makeFly(CanFly canFly){
        canFly.fly();
    }
    public static void main(String[] args) {
        Bird bird = new Bird();
        Plane plane = new Plane();
        Text text = new Text();
        bird.fly();
        plane.fly();
        text.makeFly(bird);
        text.makeFly(plane);

    }
}
