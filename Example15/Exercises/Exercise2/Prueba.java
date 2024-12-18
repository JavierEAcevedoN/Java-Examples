package Example15.Exercises.Exercise2;

public class Prueba {
    public static void main(String[] args) {
        Movil movil = new Movil();
        Pantalla pantalla = new Pantalla();
        EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica(22.5);

        estacionMeteorologica.agregarDispositivo(movil);
        estacionMeteorologica.agregarDispositivo(pantalla);

        System.out.println();
        estacionMeteorologica.cambiarTemperatura(45.2);
    }
}