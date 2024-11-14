package Example6.Exercises.Exercise1;

public class Rectangulo {
    private double altura = 1.0;
    private double anchura = 1.0;

    public Rectangulo() {
        this.altura = 1.0;
        this.anchura = 1.0;
    }

    public Rectangulo(double altura, double anchura) {
        setAltura(altura);
        setAnchura(anchura);
    }

    public double getAltura() {
        return altura;
    }

    public boolean setAltura(double altura) {
        if ((0.0<altura)&&(altura<20.0))  {
            this.altura = altura;
            return true;
        } else {
            this.altura = 1.0;
            return false;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public boolean setAnchura(double anchura) {
        if ((0.0<anchura)&&(anchura<20.0))  {
            this.anchura = anchura;
            return true;
        } else {
            this.anchura = 1.0;
            return false;
        }
    }

    public double calcularPerimetro() {
        return ((anchura * 2) + (altura * 2));
    }

    public double calcularArea() {
        return (anchura * altura);
    }
}

class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();

        if (rect.setAltura(2.4)) {
            System.out.println("Se agrego la altura");
        } else {
            System.out.println("Ese valor de altura no es valido");
        }

        if (rect.setAnchura(52.8)) {
            System.out.println("Se agrego la anchura");
        } else {
            System.out.println("Ese valor de anchura no es valido");
        }

        System.out.println("El perimetro del rectangulo es: "+rect.calcularPerimetro());
        System.out.println("El are del rectangulo es: "+rect.calcularArea());
    }
}