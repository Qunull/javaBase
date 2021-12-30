package 中秋作业;

import java.util.*;

public class VipSystem {
    Scanner input = new Scanner(System.in);

    public static Set<Integer> vipIdSet = new HashSet<>();
    public static Map<Integer,Vip> vipMap = new HashMap<>();
    static {
        for (int i = 0; i < 50; i++) {//初始化随机id集合
            vipIdSet.add((int)(Math.random()*(8999999)+1000000));
        }
        vipMap.put(1000001,new Vip(1000001,"123456","admin",99999999));
    }

    public int getRanId(){
        int ranId = 0;
        Iterator<Integer> it = vipIdSet.iterator();
        while(it.hasNext()){
           ranId = it.next();
           break;
        }
        return ranId;
    }

    public void menu(){
        System.out.println("\n***********************欢迎进入超市会员管理系统***********************");
        System.out.println("1.积分累计\t2.积分兑换\t3.查询剩余积分\t4.修改密码\t5.开卡\t6.退出");
        System.out.println("********************************************************************");
        System.out.print("请选择：");
        boolean menuChoice = true;
        while (menuChoice){
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    menuChoice = false;
                    addJiFen();
                    break;
                case 2:
                    menuChoice = false;
                    jiFenDuiHuan();
                    break;
                case 3:
                    menuChoice = false;
                    getJiFen();
                    break;
                case 4:
                    menuChoice = false;
                    setPwd();
                    break;
                case 5:
                    menuChoice = false;
                    kaiKa();
                    break;
                case 6:
                    menuChoice = false;
                    System.out.println("退出成功 程序结束");
                    break;
                default:
                    System.out.print("选择错误 请重新选择：");
                    break;
            }
        }
    }

    public boolean findVip(int id,String pwd){
        if (vipMap.containsKey(id)){
            for (Map.Entry<Integer,Vip> entry : vipMap.entrySet()){
                if (pwd.equals(entry.getValue().getCardPwd())){
                    return true;
                }
            }
            System.out.println("您输入的卡号或密码错误!");
            return false;
        }
        System.out.println("您输入的卡号不存在!");
        return false;
    }

    public void addJiFen(){
        System.out.print("请输入您的会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入您的会员卡密码：");
        String pwd = input.next();
        if (findVip(id,pwd)) {
            for (Map.Entry<Integer, Vip> entry : vipMap.entrySet()) {
                if (id == entry.getValue().getCardId()) {
                    System.out.print("请输入您本次消费的金额（消费1元累计1积分）：");
                    int xiaoFei = input.nextInt();
                    Vip vip = entry.getValue();
                    vip.setIntegral(vip.getIntegral() + xiaoFei);
                    vipMap.put(id, vip);
                    System.out.println("积分累计成功！");
                    menu();
                }
            }
        }else {
            menu();
        }
    }

    public void kaiKa(){
        System.out.print("请输入注册姓名：");
        String name = input.next();
        System.out.print("请输入注册密码：");
        String pwd = input.next();
        int id = getRanId();
        vipMap.put(id,new Vip(id,pwd,name,100));
        System.out.println("恭喜！开通会员卡成功，系统赠送您100积分！您的会员卡号为："+id);
        menu();
    }

    public void getJiFen(){
        System.out.print("请输入您的会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入您的会员卡密码：");
        String pwd = input.next();
        if (findVip(id,pwd)){
            for (Map.Entry<Integer, Vip> entry : vipMap.entrySet()) {
                if (id == entry.getValue().getCardId()) {
                    Vip vip = entry.getValue();
                    System.out.println("姓名\t\t会员卡号\t\t剩余积分\t\t开卡日期");
                    System.out.println(vip.getName()+"\t\t"+vip.getCardId()+"\t\t"+vip.getIntegral()+"\t\t"+vip.getDate());
                    menu();
                }
            }
        }else {
            menu();
        }
    }

    public void jiFenDuiHuan(){
        System.out.print("请输入您的会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入您的会员卡密码：");
        String pwd = input.next();
        if (findVip(id,pwd)){
            for (Map.Entry<Integer, Vip> entry : vipMap.entrySet()) {
                if (id == entry.getValue().getCardId()) {
                    int jiFen = entry.getValue().getIntegral();
                    if (jiFen<100){
                        System.out.println("抱歉！您的积分不足100无法抵用消费金额");
                        System.out.println("积分兑换失败！");
                        menu();
                    }
                    System.out.print("请输入您需要兑换使用的积分（100积分抵用0.1元，不足100不做抵用）：");
                    int jiFen1 = input.nextInt();
                    if (jiFen1<100){
                        System.out.println("抱歉！积分兑换小于100，无法抵用消费金额\n积分兑换失败！");
                        menu();
                    }else if (jiFen1>jiFen){
                        System.out.println("抱歉！您的积分不够，无法抵用消费金额\t积分兑换失败！");
                        menu();
                    }else {
                        entry.getValue().setIntegral(jiFen-jiFen1);
                        System.out.println("您在消费金额中使用会员积分抵消"+(jiFen1/0.01)+"元");
                        System.out.println("积分兑换成功");
                        menu();
                    }

                }
            }
        }else {
            menu();
        }
    }

    public void setPwd(){
        System.out.print("请输入您的会员卡号：");
        int id = input.nextInt();
        System.out.print("请输入您的会员卡密码：");
        String pwd = input.next();
        if (findVip(id,pwd)){
            for (Map.Entry<Integer, Vip> entry : vipMap.entrySet()) {
                if (id == entry.getValue().getCardId()) {
                    System.out.print("请输入新的密码：");
                    Vip vip = entry.getValue();
                    vip.setCardPwd(input.next());
                    entry.setValue(vip);
                    System.out.println("密码修改成功");
                    menu();
                }
            }
        }else {
            menu();
        }
    }


    public static void main(String[] args) {
        VipSystem v = new VipSystem();
        v.menu();
    }
}
