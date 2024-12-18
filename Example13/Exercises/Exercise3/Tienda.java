package Example13.Exercises.Exercise3;

public class Tienda {
    public static void main(String[] args) {
        Ropa camisa = new Camiseta("Morado", "Gavanna", "XXL");
        Ropa pantalon = new Pantalon("Naranja", "JEANS", "23");
        Ropa zapato = new Zapato("Negro", "Nike", "18");

        System.out.println();
        camisa.obtenerInformacion();
        pantalon.obtenerInformacion();
        zapato.obtenerInformacion();

        Ropa camisa2 = camisa.clone(); 
        Ropa pantalon2 = pantalon.clone(); 
        Ropa zapato2 = zapato.clone();

        System.out.println();
        camisa2.obtenerInformacion();
        pantalon2.obtenerInformacion();
        zapato2.obtenerInformacion();

        Ropa camisa3 = camisa.clone(); 
        Ropa pantalon3 = pantalon.clone(); 
        Ropa zapato3 = zapato.clone(); 

        System.out.println();
        camisa3.obtenerInformacion();
        pantalon3.obtenerInformacion();
        zapato3.obtenerInformacion();
    }
}