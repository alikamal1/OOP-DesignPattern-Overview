package Design_Pattern.Command.Composite;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }

}