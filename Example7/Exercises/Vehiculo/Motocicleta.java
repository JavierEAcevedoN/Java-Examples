package Example7.Exercises.Vehiculo;

public class Motocicleta extends Vehiculo {
    private int numAsientos = 1;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas, int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        System.out.println("Ha creado una motocicleta");
    }

    public void mostrarDatos() {
        super.mostrarCaracteristicas();
        System.out.println("Asientos: "+numAsientos);
    }

    public void pruebaMotor() {
        super.encenderMotor();
        super.apagarMotor();
        super.funciona();
    }
}
