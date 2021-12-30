package 面向对象.第二章;

public class Zuoye2 {
    public int[] people = new int[5];
    public double avg = 0;
    public int sum = 0;
    public int max = 0;
    public int add = 0;
    public void scores(int a){
        for (int i = 0; i < people.length; i++) {
            people[i] = a;
            sum += people[i];
        }
    }
    public double avg(){
        for (int i = 0; i < people.length; i++) {
            sum += people[i];
        }
        avg = sum/ people.length;
        return avg;
    }
    public int max(){
        for (int i = 0; i < people.length; i++) {
            if (people[i] > max){
                max = people[i];
            }
        }
        return max;
    }
}
