package shangchuan;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 11:49
 * @version: 1.0
 */
public class Server {
    /*
    服务器端
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1000);

        Socket accept = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D://IdeaProjects//javaSE//day13//src//shangchuan//21.jpg"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        bos.close();
        accept.close();
        ss.close();

    }
}
