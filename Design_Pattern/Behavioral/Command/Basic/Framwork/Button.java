package Design_Pattern.Behavioral.Command.Basic.Framwork;

public class Button {

    private String label;
    private final Command command;
    
    public Button(final Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }


}