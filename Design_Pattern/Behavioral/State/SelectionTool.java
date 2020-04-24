package Design_Pattern.Behavioral.State;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dshed rectangle");
    }

}