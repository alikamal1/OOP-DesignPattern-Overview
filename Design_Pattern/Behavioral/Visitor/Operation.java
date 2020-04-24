package Design_Pattern.Behavioral.Visitor;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}