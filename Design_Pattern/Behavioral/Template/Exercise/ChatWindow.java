package Design_Pattern.Behavioral.Template.Exercise;

public class ChatWindow extends Window {

    @Override
    protected void onClosing() {
        System.out.println("Performing on closing operation on chat window");
    }

    @Override
    protected void onClosed() {
        System.out.println("Performing on closed operation on chat window");
    }

}