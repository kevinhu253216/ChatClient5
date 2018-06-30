import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {// new

    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(8888);// must add IOexception
            while(true){
                Socket s = ss.accept();
System.out.println("a client connected!"); //comment
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
