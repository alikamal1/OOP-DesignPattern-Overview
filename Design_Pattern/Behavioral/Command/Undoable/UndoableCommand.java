package Design_Pattern.Behavioral.Command.Undoable;

public interface UndoableCommand extends Command {
    void unexecute();
}