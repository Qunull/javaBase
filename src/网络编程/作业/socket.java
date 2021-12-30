package 网络编程.作业;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class socket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Socket socket = null;
        OutputStream os = null;
        ObjectOutputStream oos = null;
        User user = null;

        InputStream is = null;
        BufferedReader br = null;
        try {
            socket = new Socket("127.0.0.1",19090);
            os = socket.getOutputStream();
            oos = new ObjectOutputStream(os);
            System.out.print("请输入用户名：");
            String a = input.next();
            System.out.print("请输入密码：");
            int b = input.nextInt();
            user = new User(a,b);
            oos.writeObject(user);
            oos.flush();

            socket.shutdownOutput();
            is = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                os.close();

                br.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
