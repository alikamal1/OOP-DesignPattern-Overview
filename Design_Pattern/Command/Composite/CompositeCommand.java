package Design_Pattern.Command.Composite;

import java.util.ArrayDeque;
import java.util.Deque;

public class CompositeCommand implements Command {

    private final Deque<Command> commands = new ArrayDeque<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command : commands)
            command.execute();
    }

}   