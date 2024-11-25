package Example10.Exercises.Exercise2;

public class Coche extends Vehiculo{
    private int motor;

    Coche() {
        super();
        this.motor = 1000;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
}