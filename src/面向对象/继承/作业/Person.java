package 面向对象.继承.作业;

public class Person {
    private String name;
    private String gender;
    private int birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public void revise(String name,String gender,int birthDate){
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }
    public void disPlay(){
        System.out.println("姓名："+name+" 性别："+gender+" 出生日期："+birthDate);
    }
}
