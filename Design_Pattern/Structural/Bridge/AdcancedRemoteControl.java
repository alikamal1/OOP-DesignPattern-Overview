package Design_Pattern.Structural.Bridge;

public class AdcancedRemoteControl extends RemoteControl {

    public AdcancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number)
    {
        device.setChannel(number);
    }
}