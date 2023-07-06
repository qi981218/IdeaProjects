import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 陈亚琪
 * @date 2022年07月25日 14:10
 * @version: 1.0
 */
public class ServeDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的DatagramSocket对象
        DatagramSocket socket = new DatagramSocket(1000);
        //创建数组接收数据
        byte[] bytes = new byte[1024];
        //创建接收端的DatagramPacket对象
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        //接收数据
        socket.receive(packet);
        //byte[] data = packet.getData();//获取接收到的数据
        int length = packet.getLength();//获取接收数据的长度
        int port = packet.getPort();//获取发送端的端口号
        InetAddress address = packet.getAddress();//获取发件人的地址
        System.out.println(new String(bytes, 0, length));//使用data和bytes都可以
        System.out.println(port);
        System.out.println("发件人的地址是:" + address);
        //释放资源
        socket.close();


    }
}
