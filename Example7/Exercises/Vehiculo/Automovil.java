package Example7.Exercises.Vehiculo;

public class Automovil extends Vehiculo {
    private int numAsientos = 5;
    private int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        System.out.println("Se a creado un auto");
    }

    public void mostrarDatos() {
        super.mostrarCaracteristicas();
        System.out.println("Asientos: "+numAsientos);
        System.out.println("Puertas: "+numPuertas);
    }

    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
    }
}