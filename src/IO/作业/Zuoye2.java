package IO.作业;

import java.io.*;

public class Zuoye2 {
    public static void main(String[] args) {
        //读取内容 拆分
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("");
            long nums = file.length();
            long count = 0;
            if (nums % 1024 != 0){
                count = nums/1024 + 1;
            }else {
                count = nums/1024;
            }
            fis = new FileInputStream("");
            int len = -1;
            byte[] bytes = new byte[1024];
            int i = 0;
            while ((len = fis.read(bytes))!=-1){
                fos = new FileOutputStream(""+i+".exe");
                i++;
                fos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
