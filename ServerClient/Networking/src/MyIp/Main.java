package MyIp;

import java.io.ObjectInputStream.GetField;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        String ip;
        try {
            Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
            for (NetworkInterface netint : Collections.list(nets)){
                
                Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
                for (InetAddress inetAddress : Collections.list(inetAddresses)) {
                    if (netint.isLoopback() || !netint.isUp())
                        continue;
                    ip = inetAddress.getHostAddress();
                    if(!isValidIP4Address(ip))
                        continue;
                    System.out.printf("Interface %s -InetAddress: %s \n",netint.getName(), ip);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean isValidIP4Address(String ipAddress) {
        if (ipAddress.matches("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$")) {
            String[] groups = ipAddress.split("\\.");

            for (int i = 0; i <= 3; i++) {
                String segment = groups[i];
                if (segment == null || segment.length() <= 0) {
                    return false;
                }

                int value = 0;
                try {
                    value = Integer.parseInt(segment);
                } catch (NumberFormatException e) {
                    return false;
                }
                if (value > 255) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}