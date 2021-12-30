package UDP协议;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UserLoginThread extends Thread{
    Socket socket = null;
    public UserLoginThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        String name = "zhangsan";
        String password = "a123@11";
        BufferedReader br = null;
        InputStream is = null;
        ObjectInputStream ois = null;
        User user = null;
        OutputStream os = null;
        BufferedWriter bw = null;
            try {
                // 3.打开 socket相关的输入流
                is = socket.getInputStream();
                System.out.println(socket.getInetAddress().getHostAddress()+"发送请求...");
                // 4.反序列化
                ois = new ObjectInputStream(is);
                user = (User)ois.readObject();
                //定义输出流
                os = socket.getOutputStream();
                bw = new BufferedWriter(new OutputStreamWriter(os));
                if(user!=null){ //可以去验证
                    if(user.getName().equals(name) && user.getPassword().equals(password)){
                        //登录成功
                        bw.write("登录成功!!!");
                    }else{
                        //登录失败
                        bw.write("用户名或者密码错误!");
                    }
                }else{
                    bw.write("请求失效!!!");
                }
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                    os.close();
                    ois.close();
                    is.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}
