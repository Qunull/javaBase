package 搜搜移动业务大厅;

import java.util.Scanner;

public class W {

    E yonghu = new E();
    Scanner input = new Scanner(System.in);

    public void login() {
        System.out.print("请输入手机号码：");
        long denglushouji = input.nextLong();
        System.out.print("请输入密码：");
        int denglumima = input.nextInt();
        if (yonghu.getShoujihao() == denglushouji && yonghu.getPassword() == denglumima) {
            System.out.println("*****嗖嗖移动用户菜单*****");
            System.out.println("1.本月账单查询");
            System.out.println("2.套餐余量查询");
            System.out.println("3.打印消费详单");
            System.out.println("4.套餐变更");
            System.out.println("5.办理退网");
            boolean biaoshi = true;
            while (biaoshi) {
                System.out.print("请选择：");
                int caidan = input.nextInt();
                switch (caidan) {
                    case 1:
                        System.out.println("*****本月账单查询*****");
                        System.out.println("您的卡号：" + yonghu.getShoujihao());
                        System.out.println("当月账单：");
                        System.out.println("套餐资费:" + yonghu.getTaocan() + "元");
                        System.out.println("合计：" + yonghu.getTaocan() + "元");
                        System.out.println("账户余额：" + yonghu.getFeiyong() + "元");
                        break;
                    case 2:
                        System.out.println("*****套餐余量查询*****");
                        System.out.println("您的卡号是：" + yonghu.getShoujihao());
                        System.out.println("套餐剩余：");
                        if (yonghu.getTaocanbianshi() == 1) {
                            System.out.println("通话时长：" + yonghu.getTonghua() + "分");
                            System.out.println("短信条数：" + yonghu.getDuanxin() + "条");
                        } else if (yonghu.getTaocanbianshi() == 2) {
                            System.out.println("上网流量：" + yonghu.getLiuliang() + "GB");
                        } else if (yonghu.getTaocanbianshi() == 3) {
                            System.out.println("通话时长：" + yonghu.getTonghua() + "分");
                            System.out.println("短信条数：" + yonghu.getDuanxin() + "条");
                            System.out.println("上网流量：" + yonghu.getLiuliang() + "GB");
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("*****套餐变更*****");
                        System.out.println("1.话痨套餐 2.网虫套餐 3.超人套餐");
                        int xuanzetancan = input.nextInt();
                        switch (xuanzetancan) {
                            case 1:
                                yonghu.setTaocanbianshi(1);
                                yonghu.setTaocan(58);
                                yonghu.setLiuliang(0);
                                yonghu.setTonghua(200);
                                yonghu.setDuanxin(50);
                                System.out.println("更换套餐成功！话痨套餐:通话时长：200分钟 ,短信条数：50条 ,月资费：58元");
                                break;
                            case 2:
                                yonghu.setTaocanbianshi(2);
                                yonghu.setTaocan(68);
                                yonghu.setLiuliang(5);
                                yonghu.setTonghua(0);
                                yonghu.setDuanxin(0);
                                System.out.println("更换套餐成功！网虫套餐:上网流量：5GB ,月资费：68元");
                                break;
                            case 3:
                                yonghu.setTaocanbianshi(3);
                                yonghu.setTaocan(78);
                                yonghu.setLiuliang(1);
                                yonghu.setTonghua(200);
                                yonghu.setDuanxin(100);
                                System.out.println("更换套餐成功！超人套餐:通话时长：200分钟 ,短信条数：100条 ,上网流量：1GB 月资费：78元");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("*****退出*****");
                        biaoshi = false;
                        break;
                    default:
                        biaoshi = false;
                        break;
                }
            }
        } else {
            System.out.println("对不起，您输入的信息有误，无法登录！");
        }
    }

    //注册
    public void enroll() {

        System.out.println("********可选号码********");
        int huanhang = 0;
        long haoma = 0;
        long[] shuzu = new long[9];
        for (int i = 0; i < 9; i++) {
            int suiji = (int) (Math.random() * 100000000);
            haoma = 13900000000L + suiji;
            System.out.print((i + 1) + ":" + haoma + "\t\t\t");
            shuzu[i] = haoma;
            huanhang++;
            if (huanhang % 3 == 0) {
                System.out.println();
            }
        }
        System.out.print("请选择卡号：");
        int kahao = input.nextInt();
        switch (kahao) {
            case 1:
                haoma = shuzu[0];
                break;
            case 2:
                haoma = shuzu[1];
                break;
            case 3:
                haoma = shuzu[2];
                break;
            case 4:
                haoma = shuzu[3];
                break;
            case 5:
                haoma = shuzu[4];
                break;
            case 6:
                haoma = shuzu[5];
                break;
            case 7:
                haoma = shuzu[6];
                break;
            case 8:
                haoma = shuzu[7];
                break;
            case 9:
                haoma = shuzu[8];
                break;
        }
        System.out.println("1.话痨套餐 2.网虫套餐 3.超人套餐");
        System.out.print("请选择套餐：");
        int taocanxuanze = input.nextInt();
        int taocanfeiyong = 0;
        String taocanneirong = "";
        int tonghua = 0;
        int duanxin = 0;
        int liuliang = 0;
        switch (taocanxuanze) {
            case 1:
                taocanfeiyong = 58;
                taocanneirong = "话痨套餐:通话时长：200分钟 ,短信条数：50条 ,月资费：58元";
                tonghua = 200;
                duanxin = 50;
                yonghu.setTaocanbianshi(1);
                break;
            case 2:
                taocanfeiyong = 68;
                taocanneirong = "网虫套餐:上网流量：5GB ,月资费：68元";
                liuliang = 5;
                yonghu.setTaocanbianshi(2);
                break;
            case 3:
                taocanfeiyong = 78;
                taocanneirong = "超人套餐:通话时长：200分钟 ,短信条数：100条 ,上网流量：1GB 月资费：78元";
                tonghua = 200;
                duanxin = 100;
                liuliang = 1;
                yonghu.setTaocanbianshi(3);
                break;
        }
        System.out.print("请输入姓名：");
        String xingming = input.next();
        System.out.print("请输入密码：");
        int mima = input.nextInt();
        System.out.print("请输入预存花费余额：");
        int huafei = input.nextInt();
        int yue = huafei - taocanfeiyong;
        System.out.println("注册成功！卡号：" + haoma +
                " 用户名：" + xingming + " 当前余额：" + yue+"元");
        System.out.println(taocanneirong);
        yonghu.setName(xingming);
        yonghu.setPassword(mima);
        yonghu.setShoujihao(haoma);
        yonghu.setFeiyong(yue);
        yonghu.setTaocan(taocanfeiyong);
        yonghu.setDuanxin(duanxin);
        yonghu.setTonghua(tonghua);
        yonghu.setLiuliang(liuliang);
    }

    //资费说明
    public void illustrate() {
        if (yonghu.getTaocanbianshi() == 1) {
            System.out.println("套餐类型：话痨套餐");
            System.out.println("通话时长：200分钟");
            System.out.println("短信条数：50条");
            System.out.println("月资费：58元");
        } else if (yonghu.getTaocanbianshi() == 2) {
            System.out.println("套餐类型：网虫套餐");
            System.out.println("上网流量：5GB");
            System.out.println("月资费：68元");
        } else if (yonghu.getTaocanbianshi() == 3) {
            System.out.println("套餐类型：超人套餐");
            System.out.println("通话时长：200分钟");
            System.out.println("短信条数：100条");
            System.out.println("上网流量：1GB");
            System.out.println("月资费：78元");
        }
        System.out.println("————————————————————————————");
        System.out.println("超出套餐计费：");
        System.out.println("通话时长：0.2元/分钟");
        System.out.println("短信条数：0.1元/分钟");
        System.out.println("上网流量：0.1元/MB");
    }

    //充值
    public void recharge(){
        System.out.print("请输入充值卡号：");
        long chongzhikahao = input.nextLong();
        if (chongzhikahao == yonghu.getShoujihao()){
            System.out.print("请输入充值金额：");
            double chongzhijine = input.nextDouble();
            yonghu.setFeiyong(yonghu.getFeiyong()+chongzhijine);
            System.out.println("充值成功!当前话费余额为："+yonghu.getFeiyong()+"元");
        }
    }

    //使用搜搜
    public void use(){
        int suiji = (int) (Math.random()*8);
        switch (suiji){
            case 0:
                System.out.println("不想打电话！");
                break;
            case 1:
                System.out.println("网上答题活动中奖！！！短信数+10 电话分钟+20分钟 流量+1GB");
                yonghu.setDuanxin(yonghu.getDuanxin()+10);
                yonghu.setTonghua(yonghu.getTonghua()+20);
                yonghu.setLiuliang(yonghu.getLiuliang()+1);
                break;
            case 2:
                System.out.println("打电话10分钟！电话时长-10");
                yonghu.setTonghua(yonghu.getTonghua()-10);
                break;
            case 3:
                System.out.println("群发短信！ 短信数-10");
                yonghu.setDuanxin(yonghu.getDuanxin()-10);
                break;
            case 4:
                System.out.println("上网聊QQ！ 流量-10MB");
                yonghu.setLiuliang(yonghu.getLiuliang()-0.1);
                break;
            case 5:
                System.out.println("好心人充错手机号！ 话费+100");
                yonghu.setFeiyong(yonghu.getFeiyong()+100);
                break;
            case 6:
                System.out.println("上网购物！ 话费-10");
                yonghu.setFeiyong(yonghu.getFeiyong()-10);
                break;
            case 7:
                System.out.println("手机没电关机，请充电！");
                break;
        }


    }
}
