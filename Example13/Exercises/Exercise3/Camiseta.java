package Example13.Exercises.Exercise3;

public class Camiseta extends Ropa{
    private String talla;

    public Camiseta(String color, String marca, String talla) {
        super(color, marca);
        this.talla = talla;
    }

    public Camiseta(Camiseta camiseta) {
        super(camiseta);
        if (camiseta != null) {
            this.talla = camiseta.talla;
        }
    }

    @Override
    public Ropa clone() {
        return (Camiseta) new Camiseta(this);
    }
    @Override
    public void obtenerInformacion() {
        System.out.println("Camiseta info: ");
        System.out.println("Color: "+color);
        System.out.println("Marca: "+marca);
        System.out.println("Talla: "+talla);
    }
}