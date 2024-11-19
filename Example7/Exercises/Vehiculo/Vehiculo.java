package Example7.Exercises.Vehiculo;

public class Vehiculo {
    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
        System.out.println("Construyo el vehiculo");
    }

    public void mostrarCaracteristicas() {
        System.out.println("La marca es: "+marcaModelo);
        System.out.println("El precio es: "+precioDia);
        System.out.println("Numero   de llantas: "+numLlantas);
    }

    public void encenderMotor() {
        System.out.println("El motor se encendio");
    }

    public void apagarMotor() {
        System.out.println("El motor se apago");
    }

    public void funciona() {
        System.out.println("El motor de "+marcaModelo+" funciona correctamente");
    }
}
class ejecutaVehiculo {
    public static void main(String[] args) {
        Automovil v1 = new Automovil(120, "volvo 550", 4, 5, 4);
        v1.mostrarDatos();
        v1.pruebaMotor();

        Motocicleta m1 = new Motocicleta(120, "Italika", 2, 2);
        m1.mostrarDatos();
        m1.pruebaMotor();

        Autobus a1 = new Autobus(300, "Mercedez", 8, 42,2,2);
        a1.mostrarDatos();
        a1.pruebaMotor();

        Autobus a2 = new Autobus(250, "Mercedez Smart", 6, 25, 1, 1);
        a2.mostrarDatos();
        a2.pruebaMotor();
    }
}