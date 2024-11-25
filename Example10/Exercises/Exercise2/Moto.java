package Example10.Exercises.Exercise2;

public class Moto extends Vehiculo{
    private int cilindrada;

    Moto() {
        super();
        this.cilindrada = 600;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}