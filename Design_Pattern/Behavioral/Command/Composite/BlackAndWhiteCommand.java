package Design_Pattern.Behavioral.Command.Composite;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black And White");
    }

}