package 网络编程.作业;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int passWord;

    public User(String name, int passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }
}
