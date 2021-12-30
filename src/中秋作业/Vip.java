package 中秋作业;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vip {

    private int cardId;
    private String cardPwd;
    private String name;
    private int integral;
    private String date;

    public String getDate() {
        return date;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public Vip(int cardId, String cardPwd, String name, int integral) {
        this.cardId = cardId;
        this.cardPwd = cardPwd;
        this.name = name;
        this.integral = integral;

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date datex = new Date();
        this.date = sd.format(datex);
    }

    public Vip() {
    }
}
