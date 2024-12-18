package Example12.DesignPatterns.Singlenton;

public class Prueba {
    public static void main(String[] args) {
        Configuracion confg1 = Configuracion.obtenerConfiguracion();
        Configuracion confg2 = Configuracion.obtenerConfiguracion();

        confg1.obtenerInformacion();
        System.out.println();
        confg2.obtenerInformacion();
    }
}