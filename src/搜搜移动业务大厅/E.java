package 搜搜移动业务大厅;

public class E {
    private String name;
    private int password;
    private long shoujihao;
    private double feiyong;
    private double taocan;
    private int tonghua;
    private int duanxin;
    private double liuliang;
    private int taocanbianshi;

    public int getTaocanbianshi() {
        return taocanbianshi;
    }

    public void setTaocanbianshi(int taocanbianshi) {
        this.taocanbianshi = taocanbianshi;
    }

    public double getLiuliang() {
        return liuliang;
    }

    public void setLiuliang(double liuliang) {
        this.liuliang = liuliang;
    }

    public int getTonghua() {
        return tonghua;
    }

    public void setTonghua(int tonghua) {
        this.tonghua = tonghua;
    }

    public int getDuanxin() {
        return duanxin;
    }

    public void setDuanxin(int duanxin) {
        this.duanxin = duanxin;
    }

    public double getTaocan() {
        return taocan;
    }

    public void setTaocan(double taocan) {
        this.taocan = taocan;
    }

    public double getFeiyong() {
        return feiyong;
    }

    public void setFeiyong(double feiyong) {
        this.feiyong = feiyong;
    }

    public long getShoujihao() {
        return shoujihao;
    }

    public void setShoujihao(long shoujihao) {
        this.shoujihao = shoujihao;
    }

    public E() {
    }

    public E(String name, int password, long shoujihao) {
        this.name = name;
        this.password = password;
        this.shoujihao = shoujihao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
