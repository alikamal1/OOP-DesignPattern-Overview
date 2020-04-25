package Design_Pattern.Behavioral.State.Exercise;

class Bicycle implements TravelMode {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycle)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycle)");
        return 2;
    }

}