package 娱乐;

import java.util.ArrayList;
import java.util.Iterator;

public class password {
    private int[] a = {6,0,8,7};
    private int[] b = {5,1,7,3};
    private int[] c = {1,3,5,8};
    private int[] d = {3,8,2,5};
    private int[] e = {2,5,3,1};

    private ArrayList<int[]> list;
    public password(){
        list = new ArrayList<int[]>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
    }
    public void working(){
        for (int i = 0; i < 10000; i++) {
            int num4 = i%10000/1000;
            int num3 = i%1000/100;
            int num2 = i%100/10;
            int num1 = i%10/1;

            boolean flag = false;
            int[] nums = new int[]{num4,num3,num2,num1};
            for (int j = 0; j < nums.length; j++) {
                int k = nums[j];
                if (k == 4 || k == 9){
                    flag = true;
                }
            }
            if (flag) continue;
            flag = jobing(nums);
            if (flag){
                System.out.println("正确密码："+num4+""+num3+""+num2+""+num1);
            }
        }
    }
    private boolean jobing(int[] num) {
        int count = 0;
        for (Iterator<int[]> iterator = list.iterator(); iterator.hasNext(); ) {
            int[] is = (int[]) iterator.next();
            boolean flag = doJob(num,is);
            if (flag){
                count++;
            }
        }
        if (count == list.size()){
            return true;
        }
        return false;
    }
    private boolean doJob(int[] ns , int[] ms){
        int count = 0;
        int coun = 0;
        for (int i = 0; i < ns.length; i++) {
            int n = ns[i];
            for (int k = 0; k < ms.length; k++) {
                int m = ms[k];
                if (n == m){
                    count++;
                }
            }
            if (ns[i]!=ms[i]){
                coun++;
            }
        }
        if (count == 2 && coun == ns.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        password p = new password();
        p.working();
    }
}
