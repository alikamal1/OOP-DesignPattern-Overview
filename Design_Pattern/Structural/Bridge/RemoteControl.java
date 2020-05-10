package Design_Pattern.Structural.Bridge;

public class RemoteControl {
    
    protected Device device; // the brigde
    
    
    public RemoteControl(Device device) {
        this.device = device;
    }

    public void trunOn() {
        device.trunOn();
    }

    public void trunOff() {
        device.turnOff();
    }

}