package Design_Pattern.Memento;

public class EditorState { // Memento

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}