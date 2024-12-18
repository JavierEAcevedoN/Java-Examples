package Example13.DesignPatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        // Interfaz clara.
        InterfaceLightFactory lightFactory = new InterfaceLightFactory();
        Boton botonLight = lightFactory.crearBoton();
        CampoTexto campoTextoLight = lightFactory.crearCampoTexto();

        botonLight.render();
        campoTextoLight.render();

        // Interfaz oscura.
        InterfaceDarkFactory darkFactory = new InterfaceDarkFactory();
        Boton botonDark = darkFactory.crearBoton();
        CampoTexto campoTextoDark = darkFactory.crearCampoTexto();

        botonDark.render();
        campoTextoDark.render();
    }
}