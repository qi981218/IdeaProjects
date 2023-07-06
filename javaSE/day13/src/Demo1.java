import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 陈亚琪
 * @date 2022年07月25日 10:45
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("风的故事");
        String ip = address.getHostAddress();
        System.out.println("ip:"+ip);
        String name = address.getHostName();
        System.out.println(name);
    }
}
