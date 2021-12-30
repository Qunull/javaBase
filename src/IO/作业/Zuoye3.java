package IO.作业;

import java.io.*;

public class Zuoye3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File file = new File("");
        File[] fileList = file.listFiles();
        for (File _file : fileList){
            try {
                fis = new FileInputStream(_file);
                int len = -1;
                byte[] bytes = new byte[1024];
                while ((len = fis.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                    fos.flush();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
