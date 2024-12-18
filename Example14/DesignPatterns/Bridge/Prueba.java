package Example14.DesignPatterns.Bridge;

public class Prueba {
    public static void main(String[] args) {
        Device tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);

        System.out.println("Usando el control remoto basico en el televisor:");
        remoteControl.togglePower();
        remoteControl.volumeDown();
        remoteControl.volumeDown();
        remoteControl.volumeUp();
        remoteControl.channelUp();
        remoteControl.channelUp();
        remoteControl.channelDown();
        remoteControl.togglePower();

        System.out.println();
        Device radio = new Radio();
        RemoteControlAdvanced remoteControlAdvanced =  new RemoteControlAdvanced(radio);
        System.out.println("Usando el control remoto avanzado en la radio:");
        remoteControlAdvanced.togglePower();
        remoteControlAdvanced.volumeDown();
        remoteControlAdvanced.volumeDown();
        remoteControlAdvanced.volumeUp();
        remoteControlAdvanced.channelUp();
        remoteControlAdvanced.channelUp();
        remoteControlAdvanced.channelDown();
        remoteControlAdvanced.mute();
        remoteControlAdvanced.togglePower();
    }
}