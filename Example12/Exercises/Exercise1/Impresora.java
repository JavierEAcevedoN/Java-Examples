package Example12.Exercises.Exercise1;

public class Impresora {
    private int nserie;
    private String nombre;
    private String modelo;

    private static Impresora impresora;

    private Impresora(int nserie, String nombre, String modelo) {
        this.nserie = nserie;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public static Impresora getImpresora() {
        if (impresora == null) {
            impresora = new Impresora(123213, "ImpriMax", "PH");
        }
        return impresora;
    }

    public void obtenerInformacion() {
        System.out.println("Numero de serie: "+nserie+" Nombre: "+nombre+" Modelo: "+modelo);
    }

    public void inprimir() {
        System.out.println("Se esta imprimiendo un documento");
    }
}

class Prueba {
    public static void main(String[] args) {
        Impresora impresora1 = Impresora.getImpresora();
        Impresora impresora2 = Impresora.getImpresora();

        impresora1.obtenerInformacion();
        impresora2.obtenerInformacion();

        impresora1.inprimir();
        impresora2.inprimir();
    }
}