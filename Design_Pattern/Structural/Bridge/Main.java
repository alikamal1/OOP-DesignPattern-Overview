package Design_Pattern.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl1 = new RemoteControl(new SonyTv());
        remoteControl1.trunOn();
        var advanceRemoteControl = new AdcancedRemoteControl(new SonyTv());
        advanceRemoteControl.trunOn();

        var remoteControl2 = new RemoteControl(new SamsungTv());
        remoteControl2.trunOn();

    }
}