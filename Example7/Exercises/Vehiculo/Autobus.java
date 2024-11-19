package Example7.Exercises.Vehiculo;

public class Autobus extends Vehiculo {
    private int numAsientos;
    private int numPuertas;
    private int numVentanillas;
    
    public Autobus(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas,
            int numVentanillas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
        System.out.println("Has creado un autobus");
    }

    public void mostrarDatos() {
        super.mostrarCaracteristicas();
        System.out.println("Asientos: "+numAsientos);
        System.out.println("Puertas: "+numPuertas);
        System.out.println("Ventanillas: "+numVentanillas);
    }

    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
    }
}
