package 娱乐;

public class Card {
    public int card(){
        int a = (int)(Math.random()*13+1);
        switch (a){
            case 1:
                System.out.print("杀");
                break;
            case 2:
                System.out.print("闪");
                break;
            case 3:
                System.out.print("桃");
                break;
            case 4:
                System.out.print("酒");
                break;
            case 5:
                System.out.print("万箭齐发");
                break;
            case 6:
                System.out.print("南蛮入侵");
                break;
            case 7:
                System.out.print("决斗");
                break;
            case 8:
                System.out.print("五谷丰登");
                break;
            case 9:
                System.out.print("过河拆桥");
                break;
            case 10:
                System.out.print("顺手牵羊");
                break;
            case 11:
                System.out.print("桃园结义");
                break;
            case 12:
                System.out.print("乐不思蜀");
                break;
            case 13:
                System.out.print("兵粮寸断");
                break;
        }
        return a;
    }

}
