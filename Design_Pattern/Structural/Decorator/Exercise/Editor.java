package Design_Pattern.Structural.Decorator.Exercise;

public class Editor {
    public void openProject(String path) {
        AbstractArtefect[] artefacts = {
                new MainArtefect(new Artefact("Main")),
                new Artefact("Demo"),
                new ErrorArtefect(new Artefact("EmailClient")),
                new Artefact("EmailProvider"),
        };


        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
