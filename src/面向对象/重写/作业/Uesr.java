package 面向对象.重写.作业;

public class Uesr {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Uesr(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Uesr){
            Uesr uesr = (Uesr) obj;
            if (this.name.equals(uesr.getName()) && this.password.equals(uesr.getPassword())){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Uesr u1 = new Uesr("张三","123");
        Uesr u2 = new Uesr("张三","123");

        System.out.println(u1.equals(u2));
    }
}
