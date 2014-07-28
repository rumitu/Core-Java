import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class RBIUtils {
    private int port;
    private String host;
    //private BufferedReader in;
    //private PrintWriter    out;
    private ServerSocket serversSocket;
    private Socket clientSocket;
    
    
    public void setPort(int port){
        this.port=port;
    }
    public void setPort(String port){
        this.port = Integer.parseInt(port);
    }
    
    public void setHost(String host){
        this.host = host;
    }

    public void setServerSocket(){
        try {
            System.out.println("server socket created");
            this.serversSocket =  new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createClientSocket(){
       try {
        this.clientSocket = new Socket(host,port);
        System.out.println("created client socket");
    } catch (UnknownHostException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    public void getAcceptClientSocket(){
        try {
            this.clientSocket = serversSocket.accept();
            System.out.println("client accept");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public String getMessage(){
        try {
            BufferedReader in  = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(in.readLine());
            
            return in.readLine();
        } catch (IOException e) {
            System.out.println("sjfbjmzs");
            return "errrrror";
        }
        
   }
    public void sendMessage(String message){
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
            System.out.println("send message");
            
            out.print(message);
            out.flush();
            System.out.println("my message:"+message);
        } catch (IOException e) {
            e.printStackTrace();
            
        }
   }
   
    

}
