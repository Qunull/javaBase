package 面向对象.多态.作业;

public class Text {
    public void area(Shape shape){
        if (shape instanceof Triangele){
            shape.area();
            shape.perimeter();
            shape.setcolor();
        }
        if (shape instanceof Circle){
            shape.area();
            shape.perimeter();
            shape.setcolor();
        }
    }
    public static void main(String[] args) {
        /*Shape shape = new Circle();
        shape.
        */
        Text text = new Text();
        Circle circle = new Circle();
        circle.setR(5);
        text.area(circle);
        //circle.area();
        //circle.perimeter();
        //circle.setcolor();

        Triangele triangele = new Triangele();
        triangele.setX(3);
        triangele.setY(4);
        triangele.setZ(5);
        text.area(triangele);
        //triangele.area();
        //triangele.perimeter();
        //triangele.setcolor();
    }
}
