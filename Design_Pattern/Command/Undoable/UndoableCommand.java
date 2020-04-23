package Design_Pattern.Command.Undoable;

public interface UndoableCommand extends Command {
    void unexecute();
}