package Design_Pattern.Behavioral.State;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EreaserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}