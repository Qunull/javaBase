package IO;

import java.io.*;

public class BufferRead {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        InputStreamReader isr = null;
        try {
            fr = new FileReader("");
            InputStream is = new FileInputStream("");
            isr = new InputStreamReader(is,"UTF-8");
            br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
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
