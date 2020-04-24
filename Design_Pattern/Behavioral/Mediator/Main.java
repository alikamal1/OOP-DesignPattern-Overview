package Design_Pattern.Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}