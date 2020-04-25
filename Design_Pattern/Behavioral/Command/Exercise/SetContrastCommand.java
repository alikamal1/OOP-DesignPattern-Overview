package Design_Pattern.Behavioral.Command.Exercise;

public class SetContrastCommand extends AbstractUndoableCommand {

    private float prevContrast;
    private float contrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    public void undo() {
        videoEditor.setContrast(contrast);
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(prevContrast);
    }

}