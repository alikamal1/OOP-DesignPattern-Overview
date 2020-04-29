package Design_Pattern.Structural.Decorator.Exercise;

public class MainArtefect implements AbstractArtefect {

    private AbstractArtefect artefect;

    public MainArtefect(AbstractArtefect artefect) {
        this.artefect = artefect;
    }

    @Override
    public String render() {
        return artefect.render() + " [Main]";
    }

}