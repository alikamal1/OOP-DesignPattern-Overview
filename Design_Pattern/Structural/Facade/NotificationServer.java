package Design_Pattern.Structural.Facade;

public class NotificationServer {
    
    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String Target) {
        System.out.println("Sending a message");
    }

}