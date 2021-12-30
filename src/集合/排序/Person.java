package 集合.排序;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String gander;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public Person() {
    }

    public Person(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge()){
            return 1;
        }else if (this.getAge() < o.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
