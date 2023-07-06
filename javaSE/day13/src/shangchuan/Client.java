package shangchuan;

import java.io.*;
import java.net.Socket;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 11:42
 * @version: 1.0
 */
public class Client {
    /*
    客户端
     */
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket = new Socket("127.0.0.1", 1000);

        //创建字节缓冲流读取数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://Desktop//21.jpg"));

        //写到服务器
        OutputStream os = socket.getOutputStream();
        //使用缓冲流进行写
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.flush();
        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        bis.close();
        socket.close();


    }

}