package Design_Pattern.Behavioral.Template.Exercise;

public class ProductWindow extends Window {

    @Override
    protected void onClosing() {
        System.out.println("Performing on closing operation on product window");
    }

    @Override
    protected void onClosed() {
        System.out.println("Performing on closed operation on product window");
    }

}