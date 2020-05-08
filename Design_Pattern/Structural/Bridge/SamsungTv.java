package Design_Pattern.Structural.Bridge;

public class SamsungTv implements Device {
    
    @Override
    public void trunOn() {
        System.out.println("Samsung: trun On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: trun Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: Set Channel");
    }

}