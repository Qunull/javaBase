package 数组作业.作业;

public class Zuoye6 {
    public static void main(String[] args) {
        int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int a = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i]!=0){
                a++;
            }
        }
        int newArr[] = new int[a];
        int b = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i]!=0){
                newArr[b] = oldArr[i];
                b++;
            }
        }
        for (int f : newArr){
            System.out.println(f);
        }
    }
}
