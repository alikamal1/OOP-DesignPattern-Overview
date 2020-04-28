package Design_Pattern.Structural.Composite;

public class Main {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());
        
        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group3 = new Group();
        group3.add(group1);
        group3.add(group2);
        group3.render();
        group3.move();
    }
}  