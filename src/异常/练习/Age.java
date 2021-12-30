package 异常.练习;

public class Age {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age  > 100 || age < 1){
            throw new Exception("输入的数字应该在1-100");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Age age = new Age();
        try {
            age.setAge(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
