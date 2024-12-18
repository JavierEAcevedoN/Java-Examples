package Example13.Exercises.Exercise3;

public class Pantalon extends Ropa{
    private String ancho;

    public Pantalon(String color, String marca, String ancho) {
        super(color, marca);
        this.ancho = ancho;
    }

    public Pantalon(Pantalon pantalon) {
        super(pantalon);
        if (pantalon != null) {
            this.ancho = pantalon.ancho;
        }
    }

    @Override
    public Ropa clone() {
        return (Pantalon) new Pantalon(this);
    }
    @Override
    public void obtenerInformacion() {
        System.out.println("Pantalon info: ");
        System.out.println("Color: "+color);
        System.out.println("Marca: "+marca);
        System.out.println("Ancho: "+ancho);
    }
}