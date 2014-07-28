import java.net.InetAddress;
import java.net.UnknownHostException;


public class IPAdress {

	/**
	 * @param args
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException {
		InetAddress IP = InetAddress.getLocalHost();
		System.out.println("IP of my system is := " + IP.getHostAddress());

	}

}
