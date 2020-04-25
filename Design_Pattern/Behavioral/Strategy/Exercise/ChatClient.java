package Design_Pattern.Behavioral.Strategy.Exercise;

public class ChatClient {
    private Encription encryptionAlgorithm;

    public ChatClient(Encription encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        System.out.println("Sending the encrypted message...");
        encryptionAlgorithm.encrypt(message); 
    }
}
