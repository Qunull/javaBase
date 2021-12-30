package IO.作业2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zuoye1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入宠物的名字：");
        String name = input.next();
        System.out.println("请输入宠物的种类：");
        String type = input.next();
        System.out.println("请输入主人的名字：");
        String master = input.next();
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("file/aaa");
            br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine())!= null){
                System.out.println(line);
                String a = line.replace("{name}",name);
                String b = a.replace("{type}",type);
                String c = b.replace("{master}",master);
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
