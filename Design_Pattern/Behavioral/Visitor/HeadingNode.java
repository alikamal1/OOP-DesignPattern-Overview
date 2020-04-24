package Design_Pattern.Behavioral.Visitor;

public class HeadingNode implements HtmlNode {

    @Override
    public void excute(Operation operation) {
        operation.apply(this);
    }

}