package Example9.Relaciones;

public class Bateria {
    private int cantMAh;
    private String marcaBateria;

    public Bateria(int cantMAh, String marcaBateria) {
        this.cantMAh = cantMAh;
        this.marcaBateria = marcaBateria;
    }

    public void mostrar() {
        System.out.println("Cantidad milianperios hora: "+cantMAh);
        System.out.println("Marca de la bateria: "+marcaBateria);
    }
}