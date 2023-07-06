import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 陈亚琪
 * @date 2022年07月25日 11:43
 * @version: 1.0
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的DatagramSocket对象
        DatagramSocket socket = new DatagramSocket(1314);
        //打包数据
        //要传送的数据
        String s = "77777";
        byte[] bytes = s.getBytes();
        //接收数据的地址和端口号
        //for (int j = 1; j <200; j++) {
            //String str = String.valueOf(j);
            InetAddress address = InetAddress.getByName("192.168.31.255");
            //int ip=8080;

            for (int i = 1; i < 65536; i++) {
                int ip = i;
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, ip);
                //发送数据
                socket.send(packet);
                System.out.println(address+"  "+ip);
            }
        //}
        socket.close();

    }
}
