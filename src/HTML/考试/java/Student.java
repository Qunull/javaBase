package HTML.考试.java;

public class Student {
    private String name;
    private String sex;
    private String adress;
    private String num;

    public Student() {
    }

    public Student(String name, String sex, String adress, String num) {
        this.name = name;
        this.sex = sex;
        this.adress = adress;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
