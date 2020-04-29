package Design_Pattern.Structural.Decorator.Exercise;

public class ErrorArtefect implements AbstractArtefect {

    private AbstractArtefect artefect;

    public ErrorArtefect(AbstractArtefect artefect) {
        this.artefect = artefect;
    }

    @Override
    public String render() {
        return artefect.render() + " [Error]";
    }

}