package Design_Pattern.Behavioral.Memento;

public class EditorState { // Memento

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}