package Design_Pattern.Behavioral.Command.Composite;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();
    }
}