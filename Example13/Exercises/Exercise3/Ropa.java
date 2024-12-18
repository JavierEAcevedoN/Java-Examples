package Example13.Exercises.Exercise3;

public abstract class Ropa {
    protected String color,marca;

    public Ropa(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public Ropa(Ropa ropa) {
        if (ropa != null) {
            this.color = ropa.color;
            this.marca = ropa.marca;
        }
    }

    public abstract Ropa clone();
    public abstract void obtenerInformacion();
}
