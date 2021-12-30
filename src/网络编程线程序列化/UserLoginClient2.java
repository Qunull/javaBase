package 网络编程线程序列化;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class UserLoginClient2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Socket socket = null;
        OutputStream os = null;
        BufferedWriter bw = null;

        ObjectOutputStream oos = null;
        BufferedReader br = null;
        InputStream is = null;
        User user = new User();
        try {
            socket = new Socket("localhost",9090);
            //2. 打开相关的输出流
            os = socket.getOutputStream();
            oos = new ObjectOutputStream(os);
            System.out.print("请输入用户名:");
            user.setName(in.nextLine());
            System.out.print("请输入密码:");
            user.setPassword(in.nextLine());
            //将user对象 序列化
            oos.writeObject(user);
            oos.flush();
            socket.shutdownOutput();
            //利用输入流 接收 服务器信息
            is = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            String answer = null;
            while((answer=br.readLine())!=null){
                String address = socket.getInetAddress().getHostAddress();
                System.out.println(address+"服务器说:"+answer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                is.close();
                oos.close();
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
