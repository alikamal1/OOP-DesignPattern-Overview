package Design_Pattern.Behavioral.Mediator.Exercise;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyHandlers();
    }

    public boolean isEmpty() {
        return (content == null || content.isEmpty());
    }
}
