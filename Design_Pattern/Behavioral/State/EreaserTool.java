package Design_Pattern.Behavioral.State;

public class EreaserTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Ereaser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erease something");
    }

}