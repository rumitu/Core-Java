
public class Server {
    Server(int port){
        RBIUtils utils = new RBIUtils();
        utils.setPort(port);
        utils.setServerSocket();
        utils.getAcceptClientSocket();
        
        
        utils.sendMessage("hbjkhjh");
        
    }
    
    
    

    public static void main(String[] args) {
        Server n = new Server(1234);
    }

}
