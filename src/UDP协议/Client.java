package UDP协议;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DatagramSocket socket = null;
        byte[] b = new byte[10240000];
        DatagramPacket packet = new DatagramPacket(b,b.length);
        //访问某个 地址的 端口
        while(true){
            try {
                InetAddress address = InetAddress.getLocalHost(); //获取本地的域名
                socket = new DatagramSocket();//得到socket
                System.out.print("我说:");
                String content = in.nextLine();
                //指定IP地址
                DatagramPacket dp = new DatagramPacket(content.getBytes(),content.getBytes().length,address,9000);
                socket.send(dp); //发送数据
                //接收数据
                socket.receive(packet);

                String answer = "";
                byte[] newBytes =packet.getData();
                answer += new String(newBytes,0,newBytes.length);
                System.out.println("服务器说:"+answer);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(socket!=null)
                    socket.close();
            }
        }


    }
}
