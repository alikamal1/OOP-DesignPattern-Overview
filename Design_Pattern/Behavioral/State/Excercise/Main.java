package Design_Pattern.Behavioral.State.Exercise;

public class Main {
    public static void main(String[] args) {

        var service = new DirectionService(new Transit());
        service.getEta();
        service.getDirection();
    
    }
}