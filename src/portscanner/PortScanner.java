package portscanner;

import java.net.Socket;

public class PortScanner {
    public void scan(String host, int startPort, int endPort){
        System.out.println("Scaming " + host );
        for (int port = startPort; port <= endPort; port++) {
            try { 
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " open");
                socket.close();
        }
        catch (Exception e) { 
        }
        }
    }
}