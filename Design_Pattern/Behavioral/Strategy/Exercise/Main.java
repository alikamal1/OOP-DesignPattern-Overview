package Design_Pattern.Behavioral.Strategy.Exercise;

public class Main {
    public static void main(String[] args) {
        var chat = new ChatClient(new DESEncription());
        chat.send("Hello World");
    }
}