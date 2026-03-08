package portscanner;

public class Main {
    public static void main(String[] args) {
        String target = "127.0.0.1";
        int startPort = 1;
        int endPort = 1024;

    PortScanner scanner = new PortScanner(); 
    scanner.scan(target, startPort, endPort);

    }
}