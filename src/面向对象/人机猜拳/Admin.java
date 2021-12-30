package 面向对象.人机猜拳;

public class Admin {
    private String name;
    private int scores = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores ++;
    }

    public int punch(int a){
        switch (a){
            case 1:
                System.out.println(getName()+"出拳：剪刀");
                break;
            case 2:
                System.out.println(getName()+"出拳：石头");
                break;
            case 3:
                System.out.println(getName()+"出拳：布");
                break;
            default:
                System.out.println(getName()+"输入错误！");
                break;
        }
        return a;
    }
}
