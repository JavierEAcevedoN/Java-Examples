package Example13.DesignPatterns.AbstractFactory;

public class InterfaceDarkFactory implements InterfaceFactory {
    @Override
    public Boton crearBoton() {
        return new BotonDarkj();
    }
    @Override
    public CampoTexto crearCampoTexto() {
        return new CampoTextoDark();
    }
}