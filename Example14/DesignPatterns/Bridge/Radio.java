package Example14.DesignPatterns.Bridge;

public class Radio implements Device{
    private boolean enabled = false;
    private int volume = 50;
    private int channel = 3000;

    @Override
    public boolean isEnabled() {
        return enabled;
    }
    @Override
    public void enable() {
        enabled = true;
        System.out.println("La radio esta encendida");
    }
    @Override
    public void disable() {
        enabled = false;
        System.out.println("La radio esta apagada");
    }
    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int percent) {
        volume = percent;
        System.out.println("Volumen de la radio ajustado a: "+volume+"%");
    }
    @Override
    public int getChannel() {
        return channel;
    }
    @Override
    public void setChannel(int fm) {
        this.channel = fm;
        System.out.println("Canal de la radio cambiado a: "+this.channel+" FM");
    }
}