package 面向对象.第二章.练习;

public class Teacher {
    public void modifyScores(Student[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i].score < 60){
                addScores(a);
            }
        }
    }
    public void addScores(Student[] a){
        for (int i = 0; i < a.length; i++) {
            a[i].score += 2;
        }
    }
}
