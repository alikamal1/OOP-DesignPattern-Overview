package Design_Pattern.Structural.Facade;

public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message("content"), target);
        connection.disconnect();
    }
}