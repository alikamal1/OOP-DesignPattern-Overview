package Design_Pattern.Behavioral.Memento.Exercise;

public class Main {
    public static void main(String[] args) {

        var document = new Document();
        var history = new History();

        document.setContent("First content");
        document.setFontName("first font name");
        document.setFontSize(1);
        history.push(document.createState());

        document.setContent("Second content");
        document.setFontName("Second font name");
        document.setFontSize(2);
        history.push(document.createState());

        System.out.println(document.getContent());
        System.out.println(document.getFontName());
        System.out.println(document.getFontSize());

        document.restore(history.pop());

        System.out.println(document.getContent());
        System.out.println(document.getFontName());
        System.out.println(document.getFontSize());

    }
}