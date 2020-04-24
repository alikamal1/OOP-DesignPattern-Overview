package Design_Pattern.Behavioral.Command.Composite;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }

}