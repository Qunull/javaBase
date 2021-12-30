package 网络编程.作业;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream is = null;
        ObjectInputStream ois = null;
        User user = null;

        OutputStream os = null;
        BufferedWriter bw = null;
        try {
            ServerSocket server = new ServerSocket(19090);
            socket = server.accept();
            is = socket.getInputStream();
            ois = new ObjectInputStream(is);
            Object ob = ois.readObject();
            if (ob instanceof User){
                user = (User) ob;
            }
            if (user.getName().equals("User") && user.getPassWord()==123123){
               os = socket.getOutputStream();
               bw = new BufferedWriter(new OutputStreamWriter(os));
               String a = "账号密码正确！登录成功！";
               bw.write(a);
               bw.flush();
            }else {
                os = socket.getOutputStream();
                bw = new BufferedWriter(new OutputStreamWriter(os));
                String a = "账号密码输入错误！登陆失败！";
                bw.write(a);
                bw.flush();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                is.close();

                bw.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
