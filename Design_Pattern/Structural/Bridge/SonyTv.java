package Design_Pattern.Structural.Bridge;

public class SonyTv implements Device {

    @Override
    public void trunOn() {
        System.out.println("Sony: trun On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: trun Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: Set Channel");
    }
    
}