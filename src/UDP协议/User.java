package UDP协议;

import java.io.Serializable;

public class User implements Serializable {
    private String name;//用户名
    private String password;//密码

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
}
