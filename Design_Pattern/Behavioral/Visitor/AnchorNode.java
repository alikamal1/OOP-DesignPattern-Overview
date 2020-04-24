package Design_Pattern.Behavioral.Visitor;

public class AnchorNode implements HtmlNode {

    @Override
    public void excute(Operation operation) {
        operation.apply(this);
    }

}