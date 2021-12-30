package 面向对象.多态.作业;

public class Franchise extends Store{
    private String franchiseName;
    private int franchiseMoney;
    private String franchiseTime;

    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    public int getFranchiseMoney() {
        return franchiseMoney;
    }

    public void setFranchiseMoney(int franchiseMoney) {
        this.franchiseMoney = franchiseMoney;
    }

    public String getFranchiseTime() {
        return franchiseTime;
    }

    public void setFranchiseTime(String franchiseTime) {
        this.franchiseTime = franchiseTime;
    }
    public void termination(){

    }

    @Override
    public void open() {
        System.out.println("加盟店开店");
    }

    @Override
    public void close() {
        System.out.println("加盟店关闭");
    }

    @Override
    public void shopping() {
        System.out.println("加盟店购物");
    }
    public void show(){
        System.out.println("加盟店店长："+franchiseName);
        System.out.println("加盟店加盟金额："+franchiseMoney);
    }
}
