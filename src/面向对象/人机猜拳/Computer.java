package 面向对象.人机猜拳;

public class Computer {
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

    public int punch(){
        int a = (int)(Math.random()*3+1);
        switch (a){
            case 1:
                System.out.println(name+"出拳：剪刀");
                break;
            case 2:
                System.out.println(name+"出拳：石头");
                break;
            case 3:
                System.out.println(name+"出拳：布");
                break;
        }
        return a;
    }
}
