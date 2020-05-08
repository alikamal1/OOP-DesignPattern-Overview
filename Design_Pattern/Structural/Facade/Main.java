package Design_Pattern.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        var notification = new NotificationService();
        notification.send("message", "target");
    }
}