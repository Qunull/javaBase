package IO.作业;

import java.io.*;

public class Zuoye1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
          fis  = new FileInputStream("E:\\abc.txt");
          int len = 0;
          String word = "";
          while ((len = fis.read())!= -1){
              System.out.print((char) len);
              word += (char)len;
          }
            fos = new FileOutputStream("E:\\acc.txt");
            byte[] bs = word.getBytes();
            fos.write(bs);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
