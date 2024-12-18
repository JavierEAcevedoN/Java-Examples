package Example13.Exercises.Exercise3;

public class Zapato extends Ropa{
    private String suela;

    public Zapato(String color, String marca, String suela) {
        super(color, marca);
        this.suela = suela;
    }

    public Zapato(Zapato zapato) {
        super(zapato);
        if (zapato != null) {
            this.suela = zapato.suela;
        }
    }

    @Override
    public Ropa clone() {
        return (Zapato) new Zapato(this);
    }
    @Override
    public void obtenerInformacion() {
        System.out.println("Zapato info: ");
        System.out.println("Color: "+color);
        System.out.println("Marca: "+marca);
        System.out.println("Suela: "+suela);
    }
}