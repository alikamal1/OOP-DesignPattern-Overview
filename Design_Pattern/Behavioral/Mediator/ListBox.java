package Design_Pattern.Behavioral.Mediator;

public class ListBox extends UIControl {

    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }

}