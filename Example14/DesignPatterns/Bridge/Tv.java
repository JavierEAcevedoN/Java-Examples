package Example14.DesignPatterns.Bridge;

public class Tv implements Device {
    private boolean enabled = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return enabled;
    }
    @Override
    public void enable() {
        enabled = true;
        System.out.println("El televisor esta encendido");
    }
    @Override
    public void disable() {
        enabled = false;
        System.out.println("El televisor esta apagado");
    }
    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Volumen del televisor ajustado a: "+volume+"%");
    }
    @Override
    public int getChannel() {
        return channel;
    }
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Canal del televisor cambiado a: "+this.channel);
    }
}