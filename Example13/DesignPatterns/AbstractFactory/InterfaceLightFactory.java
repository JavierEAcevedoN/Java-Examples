package Example13.DesignPatterns.AbstractFactory;

public class InterfaceLightFactory implements InterfaceFactory {
    @Override
    public Boton crearBoton() {
        return new BotonLight();
    }
    @Override
    public CampoTexto crearCampoTexto() {
        return new CampoTextoLight();
    }
}