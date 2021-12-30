package 接口.作业.计算器;

public class UseComputer {

    public void useCom(Computer com,int one,int two){
        /*if (com.equals("加")){
            new jia().computer(one,two);
        }else if (com.equals("减")){
            new jian().computer(one,two);
        }else if (com.equals("乘")){
            new cheng().computer(one,two);
        }else if (com.equals("除")){
            new chu().computer(one,two);
        }*/
        int num = com.computer(one,two);
        System.out.println("运算结果："+num+"\n");
    }
}
