package OOP.Abstraction;

public class MailService {
    public void sendEmail() {
        connect(10);
        authenticate();
        //send Email
        disconnect();
    }
    
    private void connect(int timeout) {
        System.out.println("Connect");
    }
    private void disconnect() {
        System.out.println("Disconnect");
    }
    private void authenticate() {
        System.out.println("Authenticate");
    }

}