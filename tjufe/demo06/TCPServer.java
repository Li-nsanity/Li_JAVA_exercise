package edu.tjufe.demo06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢，请开始上传文件".getBytes());
        FileInputStream fis = new FileInputStream("F:\\JAVA学习\\server\\001.JPG");
        int len1 = 0;
        byte[] bytes1 = new byte[1024];
        while((len1=fis.read(bytes1))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        socket.close();
        server.close();
    }
}
