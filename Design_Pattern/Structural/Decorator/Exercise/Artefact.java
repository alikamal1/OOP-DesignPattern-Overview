package Design_Pattern.Structural.Decorator.Exercise;

public class Artefact implements AbstractArtefect {
    private String name;
    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }

}
