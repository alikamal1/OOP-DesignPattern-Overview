package Design_Pattern.Behavioral.Template.Exercise;

public class Main {
    public static void main(String[] args) {
        var window1 = new ChatWindow();
        window1.close();

        var window2 = new ProductWindow();
        window2.close();
    }
}