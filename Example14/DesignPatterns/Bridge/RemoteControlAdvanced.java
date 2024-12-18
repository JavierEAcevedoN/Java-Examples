package Example14.DesignPatterns.Bridge;

public class RemoteControlAdvanced extends RemoteControl{
    private Device device;

    public RemoteControlAdvanced(Device device) {
        super(device);
        this.device = device;
    }

    public void mute() {
        device.setVolume(0);
    }
}