package Design_Pattern.Structural.Facade;

public class Message {

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }

}