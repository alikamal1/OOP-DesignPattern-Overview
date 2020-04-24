package Design_Pattern.Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.excute(new PlainTextOperation());
    }
}