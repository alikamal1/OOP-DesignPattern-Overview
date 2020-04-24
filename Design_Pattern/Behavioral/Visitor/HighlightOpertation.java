package Design_Pattern.Behavioral.Visitor;

public class HighlightOpertation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("hightlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("hightlight-anchor");
    }

}