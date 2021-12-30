package IO;

import java.io.*;

public class DateStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fis = new FileInputStream("");
            dis = new DataInputStream(fis);
            fos = new FileOutputStream("");
            dos = new DataOutputStream(fos);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = dis.read(bytes))!= -1){
                dos.write(bytes,0,len);
            }
            dos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                dos.close();
                fos.close();
                dis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
