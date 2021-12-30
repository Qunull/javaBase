package 拆分;

public class lx {
    public static void main(String[] args) {
        String line = "长亭外 古道边 芳草碧连天 晚风拂 柳笛声残 夕阳山外山";
        System.out.println("拆分之前：");
        System.out.println(line);
        System.out.println("拆分之后：");
        String[] words = line.split(" ");
        for (String w : words){
            System.out.println(w);
        }
    }
}
